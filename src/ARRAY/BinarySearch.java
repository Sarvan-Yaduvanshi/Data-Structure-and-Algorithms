package ARRAY;
import java.util.*;
public class BinarySearch {
    public static int calculateBinarySearch(int[] num, int key) {
        int start = 0;
        int end = num.length - 1;
        while ( start <= end) {
            int mid = ( start + end) / 2;
            if ( num[mid] == key) { // FOUND
                return mid;
            }
            if ( num[mid] < key) {  // RIGHT
                start = mid + 1;
            } else {                // LEFT
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a number of Total Element in Array :");
        int num = sc.nextInt();
        System.out.print("Please Enter a Values of Array : ");
        int[] arr = new int[num];
        for ( int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Please Enter a Key for Search Your Index : ");
        int key = sc.nextInt();
        System.out.println("Your Key Index : " + calculateBinarySearch(arr, key));
    }
}