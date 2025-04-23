package LinkedList;
import java.util.*;
public class LinkedList {
    public static class Node {
        int data;
        Node next;
        public Node (int data) {  // Constructor
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    // Methods
    public void addFirst(int data) {
        // step 1 create new node
        Node newNode = new Node(data);
        size++;
        // if Linked List is Empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 - newNode next = head
        newNode.next = head; // Link

        // Step 3 - head = newNode
        head = newNode;
    }
    // Add Last
    public void addLast(int data) {
        // Step 1 - Create a new Node
        Node newNode = new Node(data);
        size++;
        // if Linked List is Empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 - newNode next = head
        tail.next = newNode;
        // Step 3 - head = newNode
        tail = newNode;
    }
    // Print Linked List
    public void print() {  // Time Complexity -- > O(n)
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // Add in the middle
    public void addMiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i = idx - 1; temp --> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    // Remove Linked List
    public static void removeFirst() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return;
        } else if (size == 1) {
            int val = head.data;;
            head = tail = null;
            size = 0;
            return;
        }
        int val = head.data;
        head = head.next;
        size--;
    }
    public static int removeLast() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // Prev : i = size - 2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;  // tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.addMiddle(2, 3);
        ll.print();  // 1-->2-->3-->4-->5
//        System.out.println(size);
        removeFirst();
        ll.print();
        removeLast();
        ll.print();
        System.out.println(size);
    }
}

