package LinkedList;
import java.util.*;
public class keySearch {
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

    // Method to search for a key in the linked list
    public int  search(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        // Key is not found
        return -1;
    }
    public static void main(String[] args) {
        keySearch ll = new keySearch();
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
        // Searching for a key in the linked list
        System.out.print("Enter the key to search : ");
        int key = scanner.nextInt();
        System.out.println(ll.search(key));
    }
}
