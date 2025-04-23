package Graph.GraphPart3;
import java.util.*;

public class AllPathsFromSourceToTarget2 {

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

        graph[0].add(new Edge(0, 3));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void printAllPaths(ArrayList<Edge>[] graph, int src, int dest, StringBuilder path) {
        path.append(src); // Append current node to path

        if (src == dest) {
            System.out.println(path); // Print path when destination is reached
        } else {
            for (Edge e : graph[src]) {
                printAllPaths(graph, e.dest, dest, path);
            }
        }

        path.deleteCharAt(path.length() - 1); // Backtrack to remove the last node
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        int src = 5, dest = 1;
        StringBuilder path = new StringBuilder();
        printAllPaths(graph, src, dest, path);
    }
}

