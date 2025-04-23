package Graph.GraphPart3;
import java.util.*;
public class  Dijkstras_Algorithm_using_Adjacency_Matrix {
    static final int VERTEX_COUNT = 9;

    // Method to find the vertex with the smallest distance value
    private static int findMinDistanceVertex(int[] distances, boolean[] visited) {
        int minDistance = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int vertex = 0; vertex < VERTEX_COUNT; vertex++) {
            if (!visited[vertex] && distances[vertex] <= minDistance) {
                minDistance = distances[vertex];
                minIndex = vertex;
            }
        }
        return minIndex;
    }

    // Method to display the shortest distances from the source to all vertices
    private static void printShortestDistances(int[] distances) {
        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < VERTEX_COUNT; i++) {
            System.out.println(i + "\t\t" + distances[i]);
        }
    }

    // Dijkstra's algorithm to calculate the shortest path from the source vertex
    public static void dijkstra(int[][] graph, int source) {
        int[] distances = new int[VERTEX_COUNT]; // Shortest distances from source
        boolean[] visited = new boolean[VERTEX_COUNT]; // Visited vertices tracker

        // Initialize all distances to infinity and all vertices as unvisited
        Arrays.fill(distances, Integer.MAX_VALUE);
        Arrays.fill(visited, false);

        // Distance from the source to itself is always 0
        distances[source] = 0;

        // Find shortest path for all vertices
        for (int i = 0; i < VERTEX_COUNT - 1; i++) {
            // Pick the vertex with the smallest distance value that hasn't been processed yet
            int nearestVertex = findMinDistanceVertex(distances, visited);

            // Mark the chosen vertex as visited
            visited[nearestVertex] = true;

            // Update distances of neighboring vertices
            for (int vertex = 0; vertex < VERTEX_COUNT; vertex++) {
                // Update distance if:
                // 1. There's an edge from nearestVertex to vertex
                // 2. vertex hasn't been visited
                // 3. The new calculated distance is smaller than the current distance
                if (!visited[vertex] && graph[nearestVertex][vertex] != 0 &&
                        distances[nearestVertex] != Integer.MAX_VALUE &&
                        distances[nearestVertex] + graph[nearestVertex][vertex] < distances[vertex]) {
                    distances[vertex] = distances[nearestVertex] + graph[nearestVertex][vertex];
                }
            }
        }

        // Display the calculated shortest distances
        printShortestDistances(distances);
    }

    public static void main(String[] args) {
        // Graph represented as an adjacency matrix
        int[][] graph = {
                { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 }
        };
        // Compute shortest paths from vertex 0
        dijkstra(graph, 0);
    }
}
/*
   Key Notes on Dijkstra's Algorithm :-
             Time Complexity:
                * Adjacency Matrix Representation: O(V square 2)
                * Adjacency List Representation: O(E⋅logV) using a binary heap.
             Space Complexity:
                * Auxiliary space is O(V).
             Path Calculation:
                * To calculate the actual shortest path, maintain a parent array. Update this array
                  when distances are updated, and use it to trace the path from the source to each vertex.
             Limitation:
                * Dijkstra’s algorithm does not work for graphs with negative weight cycles.
                  Use Bellman-Ford in such cases.
 */
