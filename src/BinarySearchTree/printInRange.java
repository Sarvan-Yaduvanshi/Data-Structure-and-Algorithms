package BinarySearchTree;
import java.util.*;
public class printInRange {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void printInRangeAllNode(Node root, int k1, int k2) {
        if (root == null) return;
        if (root.data >= k1 && root.data <= k2) {
            printInRangeAllNode(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRangeAllNode(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRangeAllNode(root.left, k1, k2);
        } else {
            printInRangeAllNode(root.right, k1, k2);
        }
    }

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.left.left = new Node(1);
        root.left.right = new Node(6);
        root.left.left.right = new Node(4);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

        inorder(root);
        System.out.println();
        printInRangeAllNode(root, 5, 12);
    }
}
