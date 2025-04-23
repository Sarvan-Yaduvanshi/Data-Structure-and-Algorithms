package LinkedList;
import java.util.*;
public class reverseLinkedList {
        // Define Node class
        public static class Node {
            int data;
            Node next;
            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        // Head and tail of the linked list
        public static Node head;
        public static Node tail;

        // Method to add a node at the end of the list
        public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // Method to print the linked list
        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.println("null");
        }
        public void reverse() {
            Node prev = null;
            Node curr = tail = head;
            Node next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
        public static void main(String[] args) {
            reverseLinkedList ll = new reverseLinkedList();
            Scanner scanner = new Scanner(System.in);
            // Adding nodes to the linked list
            ll.addLast(1);
            ll.addLast(2);
            ll.addLast(3);
            ll.addLast(4);
            ll.addLast(5);
            ll.addLast(6);
            // Printing the linked list
            ll.print();
            ll.reverse();
            ll.print();
        }
    }
