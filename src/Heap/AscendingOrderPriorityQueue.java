package Heap;
import java.util.*;
public class AscendingOrderPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(12);
        pq.add(23);
        pq.add(10);
        pq.add(2);
        pq.add(1);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.remove();
        }
    }
}
