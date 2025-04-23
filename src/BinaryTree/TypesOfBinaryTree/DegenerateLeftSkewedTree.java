package BinaryTree.TypesOfBinaryTree;
import java.util.*;
public class DegenerateLeftSkewedTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {
        // Function to insert nodes on the left side of the current node
        static Node insert(Node root, int data) {
            // If the root is null, create a new node with the given data
            if (root == null) {
                root = new Node(data);
            } else {     // If the root is not null, recursively insert on the left side
                root.left = insert(root.left, data);
            }
            return root;
        }
        // Function to print the tree using inorder traversal
        static void printTree(Node node) {
            // Base case: if the node is not null
            if (node != null) {
                // Print the data of the current node
                System.out.println(node.data);
                // Recursively print the left subtree
                printTree(node.left);
            }
        }

        // Main method
        public static void main(String[] args) {
            // Create a root node
            Node root = null;

            // Insert nodes into the tree
            root = insert(root, 1);
            insert(root, 2);
            insert(root, 3);
            insert(root, 4);
            insert(root, 5);
            // Function call to print the tree
            printTree(root);
        }
    }
}
