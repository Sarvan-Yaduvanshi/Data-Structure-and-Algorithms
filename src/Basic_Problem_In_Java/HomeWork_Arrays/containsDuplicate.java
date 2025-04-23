package Basic_Problem_In_Java.HomeWork_Arrays;
/*
     Question 1: Given an integer array nums, return true if any value appears at least twice in
                 the array, and return false if every element is distinct.
     Example 1:
           Input: nums = [1, 2, 3,1]
           Output: true
     Example 2:
           Input: nums = [1, 2, 3,4]
           Output: false
     Example 3:
           Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
           Output: true
     Constraints:
         • 1 <= nums . length <= pow(10,5)
         • -pow(10,9) <= nums [i] <= pow(10,9)
*/
import java.util.*;
public class containsDuplicate{
    public static boolean calculateDuplicate(int[] num) {
        for ( int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number of Total Element in Array : ");
        int num = sc.nextInt();
        System.out.println("Please Enter a Array Value : ");
        int[] arr = new int[num];
        for ( int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(calculateDuplicate(arr));
    }
}

//    Time Complicity 0(n^2)

