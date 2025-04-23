package BinarySearchTree;
import java.util.*;
public class SearchingANodeBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node search(Node root, int key) {
        if (root == null || root.data == key) return root;

        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }
    public static void main(String[] args)
    {

        // Creating a hard coded tree for keeping
        // the length of the code small. We need
        // to make sure that BST properties are
        // maintained if we try some other cases.
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        // Searching for keys in the BST
        System.out.println(search(root, 19) != null
                ? "Found"
                : "Not Found");
        System.out.println(search(root, 80) != null
                ? "Found"
                : "Not Found");
    }
}
