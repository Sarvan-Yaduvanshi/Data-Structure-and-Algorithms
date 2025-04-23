package QUEUES;
import java.util.*;

public class DequeInJava {
    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();
        q.addFirst(1);
        q.addFirst(2);
        q.addFirst(3);
        q.addFirst(4); // 4 3 2 1
        q.addLast(5);
        q.addLast(6);  // 3 2 1 5 6
        q.removeFirst();
        System.out.println(q);
        System.out.println("First element in Queue : " + q.getFirst());
        System.out.println("Last element in Queue : " + q.getLast());
        }

    }
