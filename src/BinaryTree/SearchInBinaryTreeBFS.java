package BinaryTree;
import java.util.*;

class SearchInBinaryTreeBFS {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Function to search a key in a binary tree using BFS
    static Node searchBFS(Node root, int key) {
        if (root == null) {
            return null; // If tree is empty, return null
        }

        // Initialize a queue for level-order traversal
        Queue<Node> queue = new LinkedList<>();
        queue.add(root); // Start with the root node

        // Perform level-order traversal
        while (!queue.isEmpty()) {
            Node currentNode = queue.poll(); // Dequeue the front node

            // Check if the current node contains the key
            if (currentNode.data == key) {
                return currentNode; // Key found, return the node
            }

            // Enqueue the left child
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }

            // Enqueue the right child
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }

        // If we traverse the entire tree without finding the key, return null
        return null;
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

        Node result = searchBFS(root, key);
        if (result != null) {
            System.out.println("Node with value " + key + " found.");
        } else {
            System.out.println("Node with value " + key + " not found.");
        }
    }
}

