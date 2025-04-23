package LinkedList;
import java.util.*;
public class mergeSort1 {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    // Add Linked List
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //  Print Linked List
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Find The Linked List MidNode
    public Node getMid() {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;    // +1
            fast = fast.next.next;  // +2
        }
        return slow; // slow ----> midNode
    }

    //  merge function
//    public Node merge(Node head1, Node head2) {
//        Node mergeLL = new Node(-1);
//        Node temp = mergeLL;
//        while (head1 != null && head2 != null) {
//            if (head1.data <= head2.data) {
//                temp.next = head1;
//                head1 = head1.next;
//            } else {
//                temp.next = head2;
//                head2 = head2.next;
//            }
//            temp = temp.next;
//        }
//    }

    public static void main(String[] args) {
        mergeSort1 list = new mergeSort1();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.print();
    }
}
