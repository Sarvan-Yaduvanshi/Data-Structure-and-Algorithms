package ARRAY_2D;
import java.util.*;
public class DiagonalMatrix {
    public static void CalculateDiagonalMatrix(int[][] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            // Calculate Primary Diagonal
            sum += num[i][i];   // ---->  i = j
            // Calculate Secondary Diagonal
            if (i != num.length-i-1) {
                sum += num[i][num.length - i - 1];
            }
        }
        System.out.print("The Sum of Diagonal Matrix is : " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Row Number : ");
        int rows = sc.nextInt();
        System.out.print("Please Enter a Column Number : ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the Elements of the Array :");
        for ( int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter Element [" + i + "][" + j + "] : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        CalculateDiagonalMatrix(matrix);
    }
}
