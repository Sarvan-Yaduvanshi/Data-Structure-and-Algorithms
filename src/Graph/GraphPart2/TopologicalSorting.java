package Graph.GraphPart2;
import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting {
    static class Edge {
        int src, dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    // Graph creation with predefined edges
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    // Topological sort function with stack for ordering
    public static void topSort(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                dfs(graph, i, visited, stack);
            }
        }

        // Print topological order
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    // DFS helper function
    private static void dfs(ArrayList<Edge>[] graph, int node, boolean[] visited, Stack<Integer> stack) {
        visited[node] = true;

        for (Edge edge : graph[node]) {
            if (!visited[edge.dest]) {
                dfs(graph, edge.dest, visited, stack);
            }
        }
        stack.push(node); // Add after exploring all neighbors
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        topSort(graph);
    }
}
