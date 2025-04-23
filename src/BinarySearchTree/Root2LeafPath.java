package BinarySearchTree;
import java.util.*;
public class Root2LeafPath {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void printPath(ArrayList<Integer> path) {
        for (Integer integer : path) {
            System.out.print(integer + "-->");
        }
        System.out.println("Null");
    }

    public static void printRoot2Path(Node root, ArrayList<Integer> path) {
        if (root == null) return;
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        }

        printRoot2Path(root.left, path);
        printRoot2Path(root.right, path);
        path.remove(path.size() - 1);
    }

    public static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
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

        inOrder(root);
        System.out.println();
        printRoot2Path(root, new ArrayList<>());
    }
}
