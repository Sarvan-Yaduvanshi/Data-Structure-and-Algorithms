package Hashing;
import java.util.*;
public class MajorityElement3 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n / 2];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Input: Array elements
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Create an instance of the Solution class and find the majority element
        MajorityElement3 solution = new MajorityElement3();
        int majority = solution.majorityElement(nums);

        // Output the result
        if (majority != -1) {
            System.out.println("The majority element is: " + majority);
        } else {
            System.out.println("There is no majority element.");
        }

        sc.close();
    }
}

// <====>  Time complexity is O(nlogn) due to sorting, and space complexity is O(1) if sorting is done in place.
