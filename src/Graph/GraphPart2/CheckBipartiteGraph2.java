package Graph.GraphPart2;
import java.util.*;

public class CheckBipartiteGraph2 {
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

        // Create edges only for the graph size passed
        if (graph.length == 5) {
            addEdge(graph, 0, 1);
            addEdge(graph, 0, 2);
            addEdge(graph, 1, 3);
            addEdge(graph, 3, 4);
            addEdge(graph, 4, 2);  // Creates a cycle, making the graph not bipartite
        } else if (graph.length == 4) {
            addEdge(graph, 0, 1);
            addEdge(graph, 0, 2);
            addEdge(graph, 1, 3);
            addEdge(graph, 2, 3);  // This will form a bipartite graph
        }
    }

    public static void addEdge(ArrayList<Edge>[] graph, int src, int dest) {
        graph[src].add(new Edge(src, dest)); // Add edge from src to dest
        graph[dest].add(new Edge(dest, src)); // Add edge from dest to src (undirected graph)
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph) {
        int[] col = new int[graph.length];
        // No color
        Arrays.fill(col, -1);
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) {  // BFS
                q.add(i);
                col[i] = 0; // Assign a color
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (Edge e : graph[curr]) {
                        if (col[e.dest] == -1) {
                            col[e.dest] = 1 - col[curr]; // Alternate colors
                            q.add(e.dest);
                        } else if (col[e.dest] == col[curr]) {
                            return false;  // NOT Bipartite
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
        int V1 = 5;
        ArrayList<Edge>[] graph1 = new ArrayList[V1];
        createGraph(graph1);
        System.out.println(isBipartite(graph1)); // This should return false

        // For Second graph
        int V2 = 4;
        ArrayList<Edge>[] graph2 = new ArrayList[V2];
        createGraph(graph2);
        System.out.println(isBipartite(graph2));  // This should return true
    }
}

