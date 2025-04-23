package ARRAY_2D;
import java.util.Scanner;

public class SpiralMatrixPrinter {

    public static void calculateSpiralMatrix(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // 1️⃣ Top Row
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // 2️⃣ Right Column
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // 3️⃣ Bottom Row (only if more than one row remains)
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
            }

            // 4️⃣ Left Column (only if more than one column remains)
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
            }

            // Shrink the boundaries for next layer
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Row Number : ");
        int rows = sc.nextInt();

        System.out.print("Please Enter a Column Number : ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the Elements of the Array : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "] : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Spiral Order Output:");
        calculateSpiralMatrix(matrix);
    }
}

