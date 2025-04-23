package LinkedList;
import java.util.*;
public class DoublyLinkedList {
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

    // Remove --removeFirst
    public void removeFirst() {
        if (head == null) {
            System.out.println("DLL is empty ");
            return;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println(size);
        dll.removeFirst();
        dll.print();
        System.out.println(size);
        dll.removeFirst();
        dll.print();
        System.out.println(size);
    }
}
