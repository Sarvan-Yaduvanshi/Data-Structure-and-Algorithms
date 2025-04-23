package Stack;
import java.util.*;
public class ImplementationOfLinkedList {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static class Stack {
        static Node head = null;
        // Stack is empty
        public static boolean isEmpty() {
            return head == null;
        }

        // Push Operation
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        // Pop Operation
        public static void pop() {
            if (isEmpty()) {
                return;
            }
            int top = head.data;
            head = head.next;
        }

        // Peek Operation
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);
        Stack.push(5);

        while (!Stack.isEmpty()) {
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}
