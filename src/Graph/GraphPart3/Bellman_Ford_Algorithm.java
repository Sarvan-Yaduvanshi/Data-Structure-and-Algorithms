package Graph.GraphPart3;
import java.util.*;
public class Bellman_Ford_Algorithm {
    static class Edge {
        int src, dest, weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge( 0, 1, 2));
        graph[0].add(new Edge( 0, 2, 4));

        graph[1].add(new Edge( 1, 2, -4));

        graph[2].add(new Edge( 2, 3, 2));

        graph[3].add(new Edge( 3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));

    }

    public static void bellmanFord(ArrayList<Edge>[] graph, int src, int V) {  // Time Complexity --> O(V.E)

        int[] distance = new int[V];

        for (int i = 0; i < V; i++) {
            if (i != src) {
                distance[i] = Integer.MAX_VALUE;
            }
        }

        for (int k = 0; k < V - 1; k++) { // Time Complexity --> O(V)
            // Time Complexity --> O(E)
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < graph[i].size(); j++) {
                    Edge e = graph[i].get(j);
                    int u = e.src;
                    int v = e.dest;

                    if (distance[u] != Integer.MAX_VALUE && distance[u] + e.weight < distance[v]) {
                        distance[v] = distance[u] + e.weight;
                    }
                }
            }
        }

        for (int j : distance) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        bellmanFord(graph, 0, V);
    }
}
