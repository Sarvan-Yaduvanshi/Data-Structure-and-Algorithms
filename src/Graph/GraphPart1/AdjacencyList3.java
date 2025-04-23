package Graph.GraphPart1;
import java.util.*;
import java.io.*;

// Pair class to store node and weight
class Pair {
    int node, weight;

    Pair(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }
}

public class AdjacencyList3 {

    // Method to add a weighted edge
    public static void addEdge(List<List<Pair>> adj, int i, int j, int w) {
        adj.get(i).add(new Pair(j, w));
        adj.get(j).add(new Pair(i, w)); // For undirected graph
    }

    // Method to display the adjacency list with weights
    public static void displayGraph(List<List<Pair>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " : ");
            for (Pair p : adj.get(i)) {
                System.out.print("(" + p.node + ", " + p.weight + ") ");
            }
            System.out.println();
        }
    }

    // Method to print neighbors of a specific node
    public static void printNeighbors(List<List<Pair>> adj, int node) {
        System.out.print(node + "'s neighbors : ");
        for (Pair p : adj.get(node)) {
            System.out.print("(" + p.node + ", " + p.weight + ") ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 5; // Total vertices
        List<List<Pair>> graph = new ArrayList<>(V);

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Adding weighted edges
        addEdge(graph, 0, 1, 5);
        addEdge(graph, 0, 2, 1);
        addEdge(graph, 2, 1, 1);
        addEdge(graph, 2, 3, 3);
        addEdge(graph, 2, 4, 2);

        System.out.println("Adjacency List Representation with Weights: ");
        displayGraph(graph);

        System.out.println("\nPrinting 2's neighbors:");
        printNeighbors(graph, 2); // Print neighbors of node 2
    }
}
