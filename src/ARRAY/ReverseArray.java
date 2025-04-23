package ARRAY;
import java.sql.SQLOutput;
import java.util.*;
public class ReverseArray {
    public static void calculateReverseArray(int[] num) {
        int start = 0;
        int last = num.length - 1;
        while ( start < last) {
            int temp = num[last];
            num[last] = num[start];
            num[start] = temp;
            start++;
            last--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number of Total Element in Array : ");
        int num = sc.nextInt();
        System.out.println("Please Enter a Array value : ");
        int[] arr = new int[num];
        for ( int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        calculateReverseArray(arr);
        // print
        for (int j : arr) {
            System.out.println(j + " ");
        }
        System.out.println();
    }
}
