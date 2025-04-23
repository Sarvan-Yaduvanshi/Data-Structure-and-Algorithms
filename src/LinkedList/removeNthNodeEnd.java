package LinkedList;
import java.util.*;
public class removeNthNodeEnd {
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

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteNthFromEnd(int n) {
        // size calculate
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if (n == size) {
            assert head != null;
            head = head.next;  // remove first
            return;
        }
        // size - n
        int i = 1;
        int indexToFind = size - n;
        Node prev = head;
        while (i < indexToFind) {
            assert prev != null;
            prev = prev.next;
            i++;
        }
        assert prev != null;
        prev.next = prev.next.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        removeNthNodeEnd ll = new removeNthNodeEnd();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        System.out.print("Please enter a Nth node : ");
        int n = sc.nextInt();
        ll.deleteNthFromEnd(n);
        ll.print();
    }
}
