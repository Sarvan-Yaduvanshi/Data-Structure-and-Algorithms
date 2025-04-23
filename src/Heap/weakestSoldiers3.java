package Heap;
import java.util.*;
public class weakestSoldiers3 {
    // Function to count the number of soldiers (1's) using binary search
    private static int countSoldiers(int[] row) {
        int left = 0, right = row.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (row[mid] == 1) {
                left = mid + 1;  // Move right if there's a soldier (1)
            } else {
                right = mid;  // Move left if there's no soldier (0)
            }
        }
        return left;  // Returns the count of 1's
    }

    public static int[] kWeakestRows(int[][] army, int k) {
        // Min-heap (priority queue) to store {soldierCount, rowIndex}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];  // If soldier counts are equal, compare by row index
            } else {
                return a[0] - b[0];  // Otherwise, compare by soldier count
            }
        });

        // Loop through each row to count soldiers and add to the priority queue
        for (int i = 0; i < army.length; i++) {
            int soldierCount = countSoldiers(army[i]);  // Efficient binary search soldier count
            pq.offer(new int[]{soldierCount, i});
        }

        // Extract the k weakest rows
        int[] weakestRows = new int[k];
        for (int i = 0; i < k; i++) {
            weakestRows[i] = pq.remove()[1];  // Get the row index of the weakest row
        }

        return weakestRows;  // Return the result as an array of row indices
    }

    public static void main(String[] args) {
        int[][] army = {
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };

        int k = 3;

        int[] result = kWeakestRows(army, k);

        // Output the indices of the k weakest rows
        for (int row : result) {
            System.out.println("R" + row);
        }
    }

}
