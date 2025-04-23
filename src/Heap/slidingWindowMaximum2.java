package Heap;
import java.util.*;
public class slidingWindowMaximum2 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();  // Stores indices of array elements

        for (int i = 0; i < n; i++) {
            // Remove elements from the front if they are out of this window (i - k)
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove elements from the back if they are smaller than the current element
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add current element index to the deque
            deque.offerLast(i);

            // The element at the front of the deque is the largest for the current window
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;  // window size

        int[] result = maxSlidingWindow(arr, k);

        // Print result
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
