package ARRAY;
import java.util.*;
public class LargestNumber {
    public static int calculateLargestNumber(int[] num) {
        int largest = Integer.MIN_VALUE;    //  -Infinity
        int smallest = Integer.MAX_VALUE;    //  +Infinity
        for (int j : num) {
            if (largest < j) {
                largest = j;
            }
            if (smallest > j) {
                smallest = j;
            }
        }
        System.out.println("Your smallest value is : " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number of Total Element in Array : ");
        int num = sc.nextInt();
        System.out.println("Please Enter a Array Element Values : ");
        int[] arr = new int[num];
        for ( int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = calculateLargestNumber(arr);
        System.out.print("Your Largest Value is : " + largest);
    }
}
