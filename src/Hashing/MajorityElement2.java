/* Most Optimized Approach: Boyer-Moore Voting Algorithm
   The Boyer-Moore Voting Algorithm finds the majority element in linear time O(n)
   with constant space O(1), making it more optimal than the two approaches above.
   The idea is to maintain a candidate and a count. If the count is zero, we set the
   current element as the new candidate and increase the count. If the element matches
   the current candidate, we increment the count; otherwise, we decrement it.
*/

package Hashing;
import java.util.*;
public class MajorityElement2 {
    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0;

        // Phase 1: Find a candidate for majority
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2 (optional): Verify the candidate is actually the majority
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 3) {
            return candidate;
        }

        return -1; // Return -1 if no majority element (depends on problem constraints)
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
        MajorityElement2 solution = new MajorityElement2();
        int majority = solution.majorityElement(nums);

        // Output the result
        if (majority != -1) {
            System.out.println("The majority element is: " + majority);
        } else {
            System.out.println("There is no majority element.");
        }
    }
}
/*
  Explanation:
      Time Complexity: O(n), where n is the number of elements in the array.
      Space Complexity:  O(1), as we only use two variables (candidate and count).
      This approach is the best in terms of time and space efficiency when finding the majority element.
 */
