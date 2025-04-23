package QUEUES;
import java.util.*;
public class ImplementationOfQueues {
    public static class Queue {
        static int[] arr;
        static int size;
        static int rear;
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // isEmpty method to check if the queue is empty
        public static boolean isEmpty() {
            return rear == -1;
        }
        // Add Operation in Queues
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.print("Queues is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        // Remove Operation in Queues
        public static int remove() {
            if (isEmpty()) {
                System.out.print("Queue is empty");
                return -1;
            }
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            int front = arr[0];
            rear = rear - 1;
            return front;
        }

        // Peek Operation implementation
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue s = new Queue(5);
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        Queue.add(4);
        while (!Queue.isEmpty()) {
            System.out.println(Queue.peek());
            Queue.remove();
        }
    }
}
