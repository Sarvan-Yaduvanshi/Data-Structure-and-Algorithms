package Graph.GraphPart2;
import java.util.*;
public class BipartiteGraphChecker {

    // Method to check if a graph is bipartite
    public static boolean isBipartite(int n, List<List<Integer>> adjList) {
        int[] color = new int[n];
        Arrays.fill(color, -1);  // Initialize colors as -1 (uncolored)

        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {  // If not yet colored, perform BFS
                if (!bfsCheck(adjList, i, color)) {
                    return false;  // If odd cycle is found, return false
                }
            }
        }
        return true;  // No odd cycles found, graph is bipartite
    }

    // BFS to check for bipartite property
    private static boolean bfsCheck(List<List<Integer>> adjList, int src, int[] color) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(src);
        color[src] = 0;  // Start coloring with color 0

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int neighbor : adjList.get(node)) {
                if (color[neighbor] == -1) {  // If uncolored, assign opposite color
                    color[neighbor] = 1 - color[node];
                    queue.offer(neighbor);
                } else if (color[neighbor] == color[node]) {
                    // If same color as the current node, an odd cycle exists
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Example graph with 4 vertices and 4 edges (even cycle)
        int n = 4;
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        adjList.get(0).add(1);
        adjList.get(1).add(0);
        adjList.get(1).add(2);
        adjList.get(2).add(1);
        adjList.get(2).add(3);
        adjList.get(3).add(2);
        adjList.get(3).add(0);
        adjList.get(0).add(3);

        if (isBipartite(n, adjList)) {
            System.out.println("The graph is bipartite.");
        } else {
            System.out.println("The graph is not bipartite.");
        }
    }
}

