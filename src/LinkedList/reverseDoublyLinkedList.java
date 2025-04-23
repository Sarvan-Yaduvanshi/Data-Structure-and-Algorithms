package LinkedList;
import java.util.*;
public class reverseDoublyLinkedList {
    public static class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    // Add Doubly Linked List
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    // Print Linked List
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void reverseDoublyLL() {
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;  // extra step for doubly linked list
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        reverseDoublyLinkedList dll = new reverseDoublyLinkedList();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        dll.reverseDoublyLL();
        dll.print();
    }
}
