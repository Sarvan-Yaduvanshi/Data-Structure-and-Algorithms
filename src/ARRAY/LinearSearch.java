package ARRAY;
import java.util.*;
public class LinearSearch {
    public static int linearSearch(int[] num, int key) {
        for ( int i = 0; i < num.length; i++) {
            if ( num[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number of Total Element in Array  : ");
        int num = sc.nextInt();
        System.out.println("Please Enter a Array Element Values : ");
        int[] arr = new int[num];
        for ( int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Please Enter a Key For Search in Index : ");
        int key = sc.nextInt();
        int index = linearSearch(arr, key);
        if (index == -1) {
            System.out.println("KEY NOT FOUND");
        } else {
            System.out.println("Your Key Index is : " + index);
        }
    }
}
