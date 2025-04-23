package Graph.GraphPart1;
import java.util.*;
public class BFSTraversalDisconnected {

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
        addEdge(graph, 5, 6, 1);
        // Intentionally leaving node 7 disconnected for demonstration
    }

    // Helper method to add an edge to the undirected graph
    public static void addEdge(ArrayList<Edge>[] graph, int src, int dest, int weight) {
        graph[src].add(new Edge(src, dest, weight));
        graph[dest].add(new Edge(dest, src, weight));  // For undirected graphs
    }

    // BFS traversal method from a given source node
    public static void bfs(ArrayList<Edge>[] graph, boolean[] visited, int start) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            System.out.print(curr + " ");

            // Traverse all adjacent nodes
            for (Edge edge : graph[curr]) {
                if (!visited[edge.dest]) {
                    visited[edge.dest] = true;
                    queue.add(edge.dest);
                }
            }
        }
    }

    // Function to perform BFS for the whole graph including disconnected components
    public static void bfsDisconnected(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];  // To track visited nodes

        // Perform BFS for each component
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                System.out.println("BFS starting from component: " + i);
                bfs(graph, visited, i);
                System.out.println();  // Print new line for separation between components
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

                  7 (Disconnected)
         */

        int V = 8;  // Including an extra disconnected node 7
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        // Perform BFS traversal for the whole graph
        System.out.println("BFS Traversal for the entire graph:");
        bfsDisconnected(graph);
    }
}

/*
       Time Complexity:
              O(V + E) where V is the number of vertices and E is the number of edges. Each vertex
              and edge is visited once.
       Space Complexity:  O(V) for the visited[] array and the queue used in BFS.
 */

