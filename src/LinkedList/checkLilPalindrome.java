package LinkedList;
import java.util.*;
public class checkLilPalindrome {
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
    // Slow Fast Approach
    public Node findMid(Node head) { // helper function
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;  // +1
            fast = fast.next.next;  // +2
        }
        return slow; // slow is my midNode
    }
    public boolean checkPalindrome() {
        // Base Case
        if (head == null || head.next == null) {
            return true;
        }

        // step 1 Find mid
        Node midNode = findMid(head);

        // Step 2 reverse 2nd part linked list
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head;

        // Step 3 -- check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        checkLilPalindrome ll = new checkLilPalindrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(8);
        ll.print(); // 1 -->2-->2-->1
        System.out.println(ll.checkPalindrome());
    }
}
