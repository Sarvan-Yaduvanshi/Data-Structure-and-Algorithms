package Heap;
import java.util.*;
public class HeapSort {
    public static void heapif(int[] arr, int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdx = i;

        if (left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }

        if (right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }

        if (maxIdx != i) {
            // Swap
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapif(arr, maxIdx, size);
        }
    }

    public static void heapSort(int[] arr) {
        // Step - 1 build maxHeap
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {
            heapif(arr, i, n);
        }

        // Step 2 --> push largest at end index
        for (int i = n - 1; i > 0; i--) {
            // Swap(largest-first with last)
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapif(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 3};
        heapSort(arr);

        // Print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
