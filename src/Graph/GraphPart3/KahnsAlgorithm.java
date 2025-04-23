package Graph.GraphPart3;
import java.util.*;
public class KahnsAlgorithm {
    public static List<Integer> topologicalSort(int n, List<List<Integer>> adj) {
        int[] inDegree = new int[n];
        for (int i = 0; i < n; i++) {
            for (int neighbor : adj.get(i)) {
                inDegree[neighbor]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        List<Integer> topoOrder = new ArrayList<>();
        while (!queue.isEmpty()) {
            int node = queue.poll();
            topoOrder.add(node);

            for (int neighbor : adj.get(node)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        if (topoOrder.size() != n) {
            throw new IllegalArgumentException("The graph has a cycle.");
        }

        return topoOrder;
    }

    public static void main(String[] args) {
        // Example 1
        int n1 = 6;
        List<List<Integer>> adj1 = Arrays.asList(
                Arrays.asList(2, 3), // Node 0
                Arrays.asList(3, 4), // Node 1
                Arrays.asList(3),    // Node 2
                Arrays.asList(5),    // Node 3
                Arrays.asList(5),    // Node 4
                new ArrayList<>()    // Node 5
        );
        System.out.println("Topological Sort of Example 1: " + topologicalSort(n1, adj1));

        // Example 2
        int n2 = 4;
        List<List<Integer>> adj2 = Arrays.asList(
                Arrays.asList(1),    // Node 0
                Arrays.asList(2),    // Node 1
                Arrays.asList(3),    // Node 2
                new ArrayList<>()    // Node 3
        );
        System.out.println("Topological Sort of Example 2: " + topologicalSort(n2, adj2));

        // Example 3
        int n3 = 5;
        List<List<Integer>> adj3 = Arrays.asList(
                Arrays.asList(1, 2), // Node 0
                Arrays.asList(3),    // Node 1
                Arrays.asList(3),    // Node 2
                Arrays.asList(4),    // Node 3
                new ArrayList<>()    // Node 4
        );
        System.out.println("Topological Sort of Example 3: " + topologicalSort(n3, adj3));
    }
}

/*
   Complexity Analysis
      Time Complexity : O(V+E), where V is the number of vertices and E is the number of edges.
                         Calculating in-degrees and processing each vertex and edge once gives linear time complexity.
      Space Complexity: O(V) for the in-degree array, queue, and result list.
 */
