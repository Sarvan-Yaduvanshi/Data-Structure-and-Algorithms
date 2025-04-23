package Heap;
import java.util.*;
public class DeleteANodeMin_Heap {
    static class Heap {
        static ArrayList<Integer> arr = new ArrayList<>();

        public static void add(int data) {
            // Add at Last Index
            arr.add(data);

            int x = arr.size() - 1;  // x is child index
            int parent = (x - 1) / 2;  // parent idx

            while (arr.get(x) < arr.get(parent)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);

                x = parent;
                parent = (x - 1) / 2;
            }
        }

        public static int peek() {
            return arr.get(0);
        }

        private static void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }

            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }

        }
        public static int remove() {
            int data = arr.get(0);

            // Swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // Step 2 -- delete last
            arr.remove(arr.size() - 1);

            // step 3 -- heapify
            heapify(0);
            return data;
        }

        public static boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        Heap.add(3);
        Heap.add(4);
        Heap.add(1);
        Heap.add(5);

        while (!Heap.isEmpty()) {
            System.out.println(Heap.peek());
            Heap.remove();
        }
    }
}