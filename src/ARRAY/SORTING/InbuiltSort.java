package ARRAY.SORTING;
import java.util.*;
import java.util.Arrays;
public class InbuiltSort {
    public static void printArr(int[] num) {
        for ( int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
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
        Arrays.sort(arr);
        printArr(arr);
    }
}
