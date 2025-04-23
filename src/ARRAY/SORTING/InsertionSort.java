package ARRAY.SORTING;
import java.util.*;
public class InsertionSort {
    public static void calculateInsertionSort(int[] num) {
        for ( int i = 1; i < num.length; i++) {
            int currentElement = num[i];
            int previousElement = i - 1;
            // Finding out the correct position to insert
            while ( previousElement >= 0 && num[previousElement] > currentElement) {
                num[previousElement + 1] = num[previousElement];
                previousElement--;
            }
            // insertion sort
            num[previousElement + 1] = currentElement;
        }
    }
    public static void printArr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number of Total Element in Array : ");
        int num = sc.nextInt();
        System.out.println("Please Enter a Array Element Value : ");
        int[] arr = new int[num];
        for ( int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        calculateInsertionSort(arr);
        printArr(arr);
    }
}
