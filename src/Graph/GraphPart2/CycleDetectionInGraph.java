package Graph.GraphPart2;
import java.util.*;
public class CycleDetectionInGraph {
    static class Edge {
        int src, dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 3);
        addEdge(graph, 1, 2);
        addEdge(graph, 2, 0);
        addEdge(graph, 3, 4);
    }

    public static void addEdge(ArrayList<Edge>[] graph, int src, int dest) {
        graph[src].add(new Edge(src, dest));
        graph[dest].add(new Edge(dest, src));
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                if (detectCycleUtil(graph, visited, i, -1)) return true;
                // cycle exists in one of the parts
            }
        }

        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] visited, int curr, int parent) {
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            // Case 3
            if (!visited[e.dest]) {
                if (detectCycleUtil(graph, visited, e.dest, curr)) return true;
            }
            // case 1
            else if (visited[e.dest] && e.dest != parent) return true;
            // case 2 --> do nothing continue
        }

        return false;
    }

    public static void main(String[] args) {

        /*
                     0 ---------------- 3
                    /|                  |
                   / |                  |
                  /  |                  |
                 1   |                  4
                 \   |
                  \  |
                   \ |
                     2
         */

        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(detectCycle(graph));
    }
}
