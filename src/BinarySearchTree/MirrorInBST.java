package BinarySearchTree;
import java.util.*;
public class MirrorInBST {
    static class Node {
        int data;
        Node left, right;

        Node (int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static Node createMirror(Node root) {   // TM = O(N)
        if (root == null) return null;
        Node leftMirror = createMirror(root.left);
        root.left = createMirror(root.right);
        root.right = leftMirror;
        return root;
    }

    public static void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {

        /*                                     Mirror BST
                       8                             8
                      / \                           / \
                     5   10    -------->          10   5
                    / \    \                     /    /  \
                   3   6    11                 11    6    3

         */

        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.right = new Node(11);

        preOrder(root);
        System.out.println();

        root = createMirror(root);
        preOrder(root);
    }
}
