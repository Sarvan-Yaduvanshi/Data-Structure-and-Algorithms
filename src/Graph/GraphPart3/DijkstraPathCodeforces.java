package Graph.GraphPart3;
import java.io.*;
import java.util.*;

public class DijkstraPathCodeforces {
    static class Edge {
        int vertex, weight;
        Edge(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);

        // Use ArrayDeque instead of ArrayList to save memory
        List<ArrayDeque<Edge>> graph = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayDeque<>());
        }

        for (int i = 0; i < m; i++) {
            String[] edgeInfo = br.readLine().split(" ");
            int u = Integer.parseInt(edgeInfo[0]);
            int v = Integer.parseInt(edgeInfo[1]);
            int w = Integer.parseInt(edgeInfo[2]);
            graph.get(u).add(new Edge(v, w));
            graph.get(v).add(new Edge(u, w));
        }

        // Dijkstra’s algorithm setup
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        int[] parent = new int[n + 1];
        Arrays.fill(parent, -1);
        dist[1] = 0;

        PriorityQueue<Edge> pq = new PriorityQueue<>(m, Comparator.comparingInt(e -> e.weight));
        pq.add(new Edge(1, 0));

        while (!pq.isEmpty()) {
            Edge edge = pq.poll();
            int u = edge.vertex;

            if (edge.weight > dist[u]) continue;

            for (Edge neighbor : graph.get(u)) {
                int v = neighbor.vertex;
                int weight = neighbor.weight;

                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    parent[v] = u;
                    pq.add(new Edge(v, dist[v]));
                }
            }
        }

        if (dist[n] == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            List<Integer> path = new ArrayList<>();
            for (int v = n; v != -1; v = parent[v]) {
                path.add(v);
            }
            Collections.reverse(path);
            for (int node : path) {
                System.out.print(node + " ");
            }
        }
    }
}
