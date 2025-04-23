package ARRAY_2D;
import java.util.*;
public class SearchSortedArray {
    public static boolean SearchSortedArrayKey(int[][] num, int key) {
        int row = 0, col = num[0].length - 1;
        while ( row < num.length && col >= 0) {
            if (num[row][col] == key) {
                System.out.print("Your Key at : (" + row +"," + col + ")");
                return true;
            } else if ( key < num[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.print("Key NOT FOUND");
        return false;
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
        System.out.print("Please Enter a Key Number Search in Array : ");
        int key = sc.nextInt();
        SearchSortedArrayKey(matrix, key);
    }
}
