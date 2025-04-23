package Graph.GraphPart1;
import java.util.*;
public class DFSTraversalDisconnectedUndirectedGraph1 {
    static class Edge {
        int dest;
        public Edge(int dest) {
            this.dest = dest;
        }
    }

    // Method to create the graph
    public static ArrayList<Edge>[] createGraph(int V) {
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 4, 5);  // Separate component
        addEdge(graph, 5, 6);  // Separate component
        // Vertex 7 is isolated

        return graph;
    }

    // Helper method to add an edge to the undirected graph
    public static void addEdge(ArrayList<Edge>[] graph, int src, int dest) {
        graph[src].add(new Edge(dest));
        graph[dest].add(new Edge(src));
    }

    // DFS traversal for a given component
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visited) {
        System.out.print(curr + " ");
        visited[curr] = true;

        for (Edge edge : graph[curr]) {
            if (!visited[edge.dest]) {
                dfs(graph, edge.dest, visited);
            }
        }
    }

    // Complete DFS traversal for disconnected graph
    public static void completeDFSTraversal(ArrayList<Edge>[] graph, int V) {
        boolean[] visited = new boolean[V];

        // Traverse all vertices to ensure disconnected components are covered
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                System.out.print("Component: ");
                dfs(graph, i, visited);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int V = 8;  // 8 vertices including an isolated one (vertex 7)
        ArrayList<Edge>[] graph = createGraph(V);

        System.out.println("Complete DFS Traversal of the Disconnected Graph:");
        completeDFSTraversal(graph, V);
    }
}
