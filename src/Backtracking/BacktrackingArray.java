package Backtracking;
import java.util.*;
public class BacktrackingArray {
    public static void changeArr(int[] array, int i, int val) {
        // Base Case
        if (i == array.length) {
            printArr(array);
            return;
        }
        // Recursion
        array[i] = val;
        changeArr(array, i + 1, val + 1); // fnx call step
        array[i] = array[i] - 2;  // backtracking step
    }
    public static void printArr(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an array element size : ");
        int num = sc.nextInt();
        System.out.print("Please enter an array element value : ");
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        changeArr(array, 0, 1);
        printArr(array);
    }
}
