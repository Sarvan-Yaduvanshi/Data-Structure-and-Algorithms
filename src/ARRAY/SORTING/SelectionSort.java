package ARRAY.SORTING;
import java.util.*;
public class SelectionSort {
    public static void calculateSelectionSortArray(int[] num) {
        for ( int i = 0; i < num.length - 1; i++) {
            int minPosition = i;
            for ( int j = i + 1; j < num.length; j++) {
                if ( num[minPosition] > num[j]) {
                    minPosition = j;
                }
            }
            // Array Swap
            int temp = num[minPosition];
            num[minPosition] = num[i];
            num[i] = temp;
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
        calculateSelectionSortArray(arr);
        printArr(arr);
    }
}
