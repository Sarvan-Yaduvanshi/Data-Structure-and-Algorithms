package LinkedList.BasicLinkedList;
import java.util.*;
class Node {
    int data;
    Node next;
    Node(int data1, Node next1) {
        this.data = data1;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Lecture_1 {
    private static Node arrayToLinked(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i< arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};
        Node x = new Node(arr.length);
        System.out.println(x.data);
        Node head = arrayToLinked(arr);
        System.out.println(head.data);
    }
}
