package Graph.GraphPart1;
import java.util.*;
public class DFSTraversal {
    static class Edge {
        int src, dest, weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    // Method to create the graph using adjacency lists
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges for an undirected graph
        addEdge(graph, 0, 1, 1);
        addEdge(graph, 0, 2, 1);
        addEdge(graph, 1, 3, 1);
        addEdge(graph, 2, 4, 1);
        addEdge(graph, 3, 4, 1);
        addEdge(graph, 3, 5, 1);
        addEdge(graph, 4, 5, 1);
        addEdge(graph, 5, 6, 1);
    }
    // Helper method to add an edge to the undirected graph
    public static void addEdge(ArrayList<Edge>[] graph, int src, int dest, int weight) {
        graph[src].add(new Edge(src, dest, weight));
        graph[dest].add(new Edge(dest, src, weight));  // For undirected graphs
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visited) {
        // Visit
        System.out.print(curr + " ");
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                dfs(graph, e.dest, visited);
            }
        }
    }
    public static void main(String[] args) {
        /*
                    1 --------- 3
                   /            | \
                  0             |   5 --------- 6
                  \             | /
                   2 ---------- 4
         */

        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println("BFS Traversal starting from vertex 0:");
        dfs(graph, 0, new boolean[V]);
    }
}