package Graph.GraphPart2;
import java.util.*;
public class CycleDetectionInGraph2 {
    // Method to create the graph using adjacency lists
    public static void createGraph(List<Integer>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges for an undirected graph
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 3);
        addEdge(graph, 1, 2);
        addEdge(graph, 3, 4);
        addEdge(graph, 2, 0);  // Adding this edge creates a cycle
    }

    // Helper method to add an edge to the undirected graph
    public static void addEdge(List<Integer>[] graph, int src, int dest) {
        graph[src].add(dest);
        graph[dest].add(src);
    }

    public static boolean detectCycle(List<Integer>[] graph) {
        boolean[] visited = new boolean[graph.length];

        // Check each component of the graph for cycles
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i] && detectCycleUtil(graph, visited, i, -1)) {
                return true;
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(List<Integer>[] graph, boolean[] visited, int curr, int parent) {
        visited[curr] = true;

        // Visit all adjacent nodes
        for (int neighbor : graph[curr]) {
            if (!visited[neighbor]) {
                if (detectCycleUtil(graph, visited, neighbor, curr)) {
                    return true;
                }
            } else if (neighbor != parent) {  // Found a back edge, indicating a cycle
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /*
                     0 ----------- 3
                    / |             \
                   1  |              4
                   |  |
                   ----
                    2
         */

        int V = 5;
        List<Integer>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println("Cycle detected: " + detectCycle(graph)); // Should print "true" as a cycle exists
    }
}
