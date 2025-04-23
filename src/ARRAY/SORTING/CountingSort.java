package ARRAY.SORTING;
import java.util.*;
public class CountingSort {
    public static void calculateCountingSortArray(int[] num) {
        int largest = Integer.MIN_VALUE;
        for ( int i = 0; i < num.length; i++) {
            largest = Math.max(largest, num[i]);
        }
        int[] count = new int[largest + 1];
        for ( int i = 0; i < num.length; i++) {
            count[num[i]]++;
        }
        // Sorting
        int j = 0;
        for ( int i = 0; i < count.length; i++) {
            while ( count[i] > 0) {
                num[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArr(int[] arr) {
        for ( int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number of Total Element in Array : ");
        int num = sc.nextInt();
        System.out.println("Please Enter a Array Element Value :");
        int[] arr = new int[num];
        for ( int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        calculateCountingSortArray(arr);
        printArr(arr);
    }
}