package Heap;
import java.util.*;

public class weakestSoldiers2 {

    // Helper function to count soldiers using binary search
    private static int countSoldiers(int[] row) {
        int left = 0, right = row.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (row[mid] == 1) {
                left = mid + 1;  // Search on the right side if soldiers are still found
            } else {
                right = mid;  // Move to the left side to find the first zero
            }
        }
        return left;  // 'left' will give the count of soldiers
    }

    public static void main(String[] args) {
        int[][] army = {{1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0}};

        int k = 2;

        // Priority Queue using a custom Comparator (lambda function)
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];  // Compare based on index if soldiers are equal
            } else {
                return a[0] - b[0];  // Compare based on soldiers count
            }
        });

        for (int i = 0; i < army.length; i++) {
            int soldierCount = countSoldiers(army[i]);  // Efficient soldier counting
            pq.add(new int[]{soldierCount, i});  // Store as {soldiers, index}
        }

        // Output the indices of the k weakest rows
        for (int i = 0; i < k; i++) {
            System.out.println("R" + pq.remove()[1]);  // Extract row index
        }
    }
}
//   The time complexity o(mlogn + klogk) where m is number row and n number column