package BinarySearchTree;
import java.util.*;
public class BuildOfBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (root.data > value) {
            // Left subtree
            root.left = insert(root.left, value);
        } else {
            // Right subtree
            root.right = insert(root.right, value);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] values = {45, 15, 79, 90, 10, 55, 12, 20, 50};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();
    }
}
