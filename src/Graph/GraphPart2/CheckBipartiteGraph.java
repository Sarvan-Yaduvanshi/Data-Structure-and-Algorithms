package Graph.GraphPart2;
import java.util.*;

public class CheckBipartiteGraph {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 3, 4);
        addEdge(graph, 4, 2);  // This creates a cycle and makes the graph not bipartite
    }

    public static void addEdge(ArrayList<Edge>[] graph, int src, int dest) {
        graph[src].add(new Edge(src, dest)); // Add edge from src to dest
        graph[dest].add(new Edge(dest, src)); // Add edge from dest to src (undirected graph)
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph) {
        int[] col = new int[graph.length];
        // no color
        Arrays.fill(col, -1);
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) {  // BFS
                q.add(i);
                col[i] = 0; // Assign a color
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);  // e.dest
                        if (col[e.dest] == -1) {
                            int nextCol = col[curr] == 0 ? 1 : 0;
                            col[e.dest] = nextCol;
                            q.add(e.dest);
                        } else if (col[e.dest] == col[curr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /*
              0 ------- 2
             /         /
            /        /
           1        4
           \       /
             \   /
               3

               false
         */

        /*
                          0
                        /   \
                      /       \
                     1         2
                      \       /
                        \   /
                          3

                          true
         */

        // For First graph
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(isBipartite(graph)); // This should return false
    }
}
