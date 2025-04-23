package BinarySearchTree;
import java.util.*;
public class DeleteANodeInBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static Node delete(Node root, int value) {
        if (root.data < value) {
            root.right = delete(root.right, value);
        } else if (root.data > value) {
            root.left = delete(root.left, value);
        } else {  // voila
            // case 1 -- leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 -- single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 -- two children
            Node inOrderSuccessor = findInorderSuccessor(root.right);
            root.data = inOrderSuccessor.data;
            root.right = delete(root.right, inOrderSuccessor.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right = new Node(70);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        inorder(root);
        System.out.println();
        root = delete(root, 20);
        System.out.println();
        inorder(root);
        root = delete(root, 50);
        System.out.println();
        inorder(root);
    }
}
