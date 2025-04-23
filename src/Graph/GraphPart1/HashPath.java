package Graph.GraphPart1;
import java.security.interfaces.EdECKey;
import java.util.*;
public class HashPath {
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
        // Adding edges for an undirected graph
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 4);
        addEdge(graph, 3, 4);
        addEdge(graph, 3, 5);
        addEdge(graph, 4, 5);
        addEdge(graph, 5, 6);

    }

    public static void addEdge(ArrayList<Edge>[] graph, int src, int dest) {
        for (int i = 0; i < graph.length; i++) {
            graph[src].add(new Edge(src, dest));
            graph[dest].add(new Edge(dest, src));
        }
    }

    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited) {
        if (src == dest) return true;
        visited[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            // e.dest = neighbour
            if (!visited[e.dest] && hasPath(graph, e.dest, dest, visited)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        /*
                     1 ------------- 3
                    /               |  \
                   /                |   \
                  0                 |    5 ------------6
                   \                |   /
                    \               |  /
                     2 -------------4

         */

        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(hasPath(graph, 0, 5, new boolean[V]));
    }
}
