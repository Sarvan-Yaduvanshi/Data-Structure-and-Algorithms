package Divide_and_Conquer;
import java.util.*;
public class quickSort {
    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void quickSortAlgo(int[] array, int si, int ei) {
        // Base Case
        if (si >= ei) {
            return;
        }
        // Last Element
        int pIdx = partition(array, si, ei);
        quickSortAlgo(array, si, pIdx - 1);  // Left Part
        quickSortAlgo(array, pIdx + 1, ei);  // Right Part
    }
    public static int partition(int[] array, int si, int ei) {
        int pivot = array[ei];
        int i = si - 1;  //  To make place for element smaller than pivot

        for (int j = si; j < ei; j++) {
            if (array[j] <= pivot) {
                i++;
                // Swap value
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        i++;
        array[ei] = array[i];
        array[i] = pivot;
        return i;
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
        quickSortAlgo(array, 0, array.length - 1);
        printArray(array);
    }
}
