package BinaryTree;
import java.util.*;

class SearchInBinaryTreeDFS {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Function to search a key in a binary tree using DFS (Pre-order)
    static Node searchDFS(Node root, int key) {
        // Base case: If the current node is null, return null (key not found)
        if (root == null) {
            return null;
        }

        // If the current node contains the key, return the node
        if (root.data == key) {
            return root;
        }

        // Recursively search the left subtree
        Node leftResult = searchDFS(root.left, key);
        if (leftResult != null) {
            return leftResult; // If key is found in the left subtree, return the node
        }

        // Recursively search the right subtree
        return searchDFS(root.right, key); // Return result from the right subtree
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int key = 5;

        Node result = searchDFS(root, key);
        if (result != null) {
            System.out.println("Node with value " + key + " found.");
        } else {
            System.out.println("Node with value " + key + " not found.");
        }
    }
}

