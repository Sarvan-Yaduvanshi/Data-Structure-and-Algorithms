package ARRAY.SORTING;
import java.util.*;
import java.util.Collections;
public class InbuiltSortReverse {
    public static void printArr(Integer[] num) {
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
        Integer[] arr = new Integer[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr,Collections.reverseOrder());
        printArr(arr);
    }
}
