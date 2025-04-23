package BinaryTree;
import java.util.*;
public class TransformToSumTree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int Transform(Node root) {
        if (root == null) {
            return 0;
        }

        int leftChild = Transform(root.left);
        int rightChild = Transform(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = newLeft + leftChild + newRight + rightChild;
        return data;
    }

    public static void PreOrder(Node root) {
        if (root ==null) {
            return;
        }
        System.out.print(root.data + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public static void main(String[] args) {

        /*

                1
               / \
              2    3
            /  \  /  \
           4    5 6   7

           expected sum tree is :

                 27
                /  \
               9    13
              / \   / \
             0   0 0   0

         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Transform(root);
        PreOrder(root);
    }
}
