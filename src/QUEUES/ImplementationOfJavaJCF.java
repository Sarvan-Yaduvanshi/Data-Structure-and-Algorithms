package QUEUES;
import java.util.*;
public class ImplementationOfJavaJCF {
    public static void main(String[] args) {
//        Queue<Integer> q = new LinkedList<>();  // ArrayDeque se bhi kr sakte hai
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        System.out.println(q.remove());
        q.add(6);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

//   =======>  Time Complexity O(1)   =======>
