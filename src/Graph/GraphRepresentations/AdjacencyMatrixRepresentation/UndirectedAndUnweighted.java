package Graph.GraphRepresentations.AdjacencyMatrixRepresentation;
import java.util.*;
public class UndirectedAndUnweighted {
    public static void addEdge(int[][] mat, int i, int j) {
        mat[i][j] = 1;
        mat[j][i] = 1;
    }

    public static void displayMatrix(int[][] mat) {

        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val  + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int V = 4;
        int[][] mat = new int[V][V];

        /*
                 0 --------------> 1
                                   |
                                   |
                                   |
                 3 --------------> 2
         */

        addEdge(mat, 0, 1);
        addEdge(mat, 1, 2);
        addEdge(mat, 2, 3);

        /* Alternatively we can also create using below
           code if we know all edges in advance

         int[][] mat = {{ 0, 1, 0, 0 },
                        { 1, 0, 1, 0 },
                        { 0, 1, 0, 1 },
                        { 0, 0, 1, 0 } };
          */

        System.out.println("Adjacency Matrix Representations ");
        displayMatrix(mat);
    }
}
