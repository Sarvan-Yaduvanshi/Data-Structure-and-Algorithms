package BinarySearchTree;
import java.util.*;
public class ValidInBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) return true;
        if (min != null && root.data <= min.data) return false;
        else if (max != null && root.data >= max.data) return false;
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right = new Node(6);
        root.right.right = new Node(7);
        inOrder(root);
        System.out.println();
        if (isValidBST(root, null, null)) {
            System.out.print("Binary Search is Valid");
        } else {
            System.out.print("Binary Search Tree is Not valid");
        }
    }
}
