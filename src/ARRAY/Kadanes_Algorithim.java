package ARRAY;
import java.util.*;
public class Kadanes_Algorithim {
    public static void maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("The max sum is : " + maxSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter of Total Array of element : ");
        int number = sc.nextInt();
        System.out.println("Please Enter Array element values : ");
        int[] arr = new int[number];
        for ( int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
        }
        maxSubArray(arr);
    }
}
