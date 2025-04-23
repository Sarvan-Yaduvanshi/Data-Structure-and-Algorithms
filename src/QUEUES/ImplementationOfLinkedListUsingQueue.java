package QUEUES;
import java.util.*;
public class ImplementationOfLinkedListUsingQueue {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {
        public static Node head;
        public static Node tail;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail =newNode;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = head.data;
            // single element
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

        public static void main(String[] args) {
            Queue q = new Queue();
            Queue.add(1);
            Queue.add(2);
            Queue.add(3);
            Queue.add(4);
            System.out.println(Queue.remove());
            Queue.add(5);
            System.out.println(Queue.remove());
            Queue.add(6);

            while (!Queue.isEmpty()) {
                System.out.println(Queue.peek());
                Queue.remove();
            }
        }
    }
}

//  ========>  Time Complexity O(1)   ========>
