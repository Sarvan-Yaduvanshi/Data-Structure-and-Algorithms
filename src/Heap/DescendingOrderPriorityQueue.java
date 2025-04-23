package Heap;
import java.util.*;
public class DescendingOrderPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(23);
        pq.add(26);
        pq.add(10);
        pq.add(64);
        pq.add(1);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.remove();
        }
    }
}
