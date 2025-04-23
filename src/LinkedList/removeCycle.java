package LinkedList;
import java.util.*;
public class removeCycle {
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
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;  // +1
            fast = fast.next.next;  // +2
            if (slow == fast) {
                return true;  // Cycle exits
            }
        }
        return false; // Cycle doesn't exit
    }
    public removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (!cycle) {
            return;
        }

        // finding meeting point
        slow = head;
        Node prev = null;  // last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle ---> last.next = null
        assert prev != null;
        prev.next = null;
    }
    public static void main(String[] args) {
        head  = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        // 1-->2-->3-->2
        System.out.println(isCycle()); 
        new removeCycle();
        System.out.println(isCycle());
    }

}
