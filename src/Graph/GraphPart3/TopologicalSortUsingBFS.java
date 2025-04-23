package Graph.GraphPart3;
import java.util.*;
public class TopologicalSortUsingBFS {
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

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void calInDegree(ArrayList<Edge>[] graph, int[] inDeg) {

//        for (int i = 0; i < graph.length; i++) {
//            for (int j = 0; j < graph[i].size(); j++) {
//                Edge e = graph[i].get(j);
//                inDeg[e.dest]++;
//            }
//        }
        for (ArrayList<Edge> edges : graph) {
            for (Edge e : edges) {
                inDeg[e.dest]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge>[] graph) {

        int[] inDeg = new int[graph.length];
        calInDegree(graph, inDeg);
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if(inDeg[i] == 0) {
                queue.add(i);
            }
        }

        // BFS operation for Topological Sort
        while (!queue.isEmpty()) {
            int curr = queue.remove();
            System.out.print(curr + " "); // print topological order

//            for (int i = 0; i < graph[curr].size(); i++) {
//                Edge e = graph[curr].get(i);
//                inDeg[e.dest]--;
//                if (inDeg[e.dest] == 0) {
//                    q.add(e.dest);
//                }
//            }
            for (Edge e : graph[curr]) {
                inDeg[e.dest]--;
                if (inDeg[e.dest] == 0) {
                    queue.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        topSort(graph);
    }
}
