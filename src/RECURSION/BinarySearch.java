package RECURSION;
import java.util.*;
public class BinarySearch {
    public static int binarySearch(int[] nums, int low, int high, int target) {
        if (low > high) return -1; //Base case.

        // Perform the steps:
        int mid = (low + high) / 2;
        if (nums[mid] == target) return mid;
        else if (target > nums[mid])
            return binarySearch(nums, mid + 1, high, target);
        return binarySearch(nums, low, mid - 1, target);
    }

    public static int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Total Element in Array : ");
        int num = sc.nextInt();
        System.out.print("Please Enter a Array Element Value : ");
        int[] array = new int[num];
        for(int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Please Enter a Target Key : ");
        int target = sc.nextInt();
        int index = search(array, target);
        if (index == -1) {
            System.out.print("Key target is not present.");
        } else {
            System.out.print("The target is at index: " + index);
        }
    }
}
