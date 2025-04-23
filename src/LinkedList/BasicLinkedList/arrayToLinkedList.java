package LinkedList.BasicLinkedList;
import java.util.*;
public class arrayToLinkedList {
    public static class Node {
        int data;
        Node next;
        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void main(String[] args) {
        arrayToLinkedList list = new arrayToLinkedList();
//        list.addFirst(1);
//        list.addFirst(2);
//        list.addFirst(3);
//        list.addFirst(4);
//        list.addFirst(5);
//        list.print();
        list.addLast(9);
        list.addLast(10);
        list.addLast(11);
        list.addLast(12);
        list.addLast(13);
        list.print();
    }
}
