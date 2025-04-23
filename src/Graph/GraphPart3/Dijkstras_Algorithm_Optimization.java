package Graph.GraphPart3;
import java.util.*;

public class Dijkstras_Algorithm_Optimization {
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

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    static class Pair implements Comparable<Pair> {
        int node, path;

        public Pair(int node, int path) {
            this.node = node;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p) {
            return Integer.compare(this.path, p.path);
        }
    }

    public static void dijkstra(ArrayList<Edge>[] graph, int src) {
        int[] dist = new int[graph.length];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        boolean[] visited = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            if (visited[curr.node]) continue; // Skip if already visited

            visited[curr.node] = true;

            for (Edge e : graph[curr.node]) {
                if (!visited[e.dest] && dist[curr.node] + e.weight < dist[e.dest]) {
                    dist[e.dest] = dist[curr.node] + e.weight;
                    pq.add(new Pair(e.dest, dist[e.dest]));
                }
            }
        }

        // Print all source to vertices shortest distances
        for (int d : dist) {
            System.out.print((d == Integer.MAX_VALUE ? "∞" : d) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        int src = 0;
        dijkstra(graph, src);
    }
}

/*
   1. Initialization :
          * Initializing the dist array takes O(V), where V is the number of vertices.
   2. Priority Queue Operations :
          * Each vertex is processed once, and each operation on the priority queue (insertion and
            extraction) takes O(logV).
          * Since each vertex is added to the priority queue once, this results in a total complexity
            of O(VlogV) for processing the vertices.
   3. Relaxing Edges :
          * For each vertex, we iterate through its adjacent edges (neighbors). In the worst case,
            every edge could be processed once, so the time complexity for edge relaxation is O(ElogV),
            where E is the number of edges. O(logV) is due to the priority queue updates when we
            find a shorter path to a neighbor and push it into the queue.

    Overall Time Complexity :
          Combining these, the total time complexity is: O((V+E)logV) This complexity arises because:
          O(VlogV) accounts for the vertices being processed. O(ElogV) accounts for each edge being
          processed and updated in the priority queue.

    Summary :
         Time Complexity: O((V+E)logV)
         Space Complexity: O(V+E) for the adjacency list, dist, visited, and priority queue.
 */

