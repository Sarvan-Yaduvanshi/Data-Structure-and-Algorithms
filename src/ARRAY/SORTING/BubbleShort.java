package ARRAY.SORTING;
import java.util.*;
public class BubbleShort {
    public static void calculateBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for ( int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
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
        System.out.println("Please Enter a Array Element Values : ");
        int[] arr = new int[num];
        for ( int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        calculateBubbleSort(arr);
        printArr(arr);
    }
}
