package BinaryTree;
import java.util.*;

class DeleteABinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    Node root;

    // Function to perform level-order traversal to find the deepest node
    Node findDeepestNode(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node temp = null;

        while (!queue.isEmpty()) {
            temp = queue.poll();

            // Enqueue left child
            if (temp.left != null)
                queue.add(temp.left);

            // Enqueue right child
            if (temp.right != null)
                queue.add(temp.right);
        }
        return temp;
    }

    // Function to delete the deepest node
    void deleteDeepestNode(Node root, Node delNode) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            if (temp == delNode) {
                temp = null;
                return;
            }
            if (temp.right != null) {
                if (temp.right == delNode) {
                    temp.right = null;
                    return;
                } else
                    queue.add(temp.right);
            }

            if (temp.left != null) {
                if (temp.left == delNode) {
                    temp.left = null;
                    return;
                } else
                    queue.add(temp.left);
            }
        }
    }

    // Function to delete a node with a given key in a binary tree
    Node deleteNode(Node root, int key) {
        if (root == null)
            return null;

        if (root.left == null && root.right == null) {
            if (root.data == key)
                return null;
            else
                return root;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node keyNode = null;
        Node temp;

        // Do level order traversal to find the keyNode and the deepest node
        while (!queue.isEmpty()) {
            temp = queue.poll();

            if (temp.data == key)
                keyNode = temp;

            if (temp.left != null)
                queue.add(temp.left);

            if (temp.right != null)
                queue.add(temp.right);
        }

        // If the keyNode is found, replace its value with the deepest node and delete the deepest node
        if (keyNode != null) {
            Node deepestNode = findDeepestNode(root);
            keyNode.data = deepestNode.data;
            deleteDeepestNode(root, deepestNode);
        }

        return root;
    }

    // Utility function for inorder traversal
    void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        DeleteABinaryTree tree = new DeleteABinaryTree();

        // Constructing binary tree
        tree.root = new Node(10);
        tree.root.left = new Node(11);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(12);
        tree.root.right = new Node(9);
        tree.root.right.left = new Node(15);
        tree.root.right.right = new Node(8);

        System.out.println("Inorder traversal before deletion:");
        tree.inorder(tree.root);

        int key = 11;
        tree.deleteNode(tree.root, key);

        System.out.println("\nInorder traversal after deletion:");
        tree.inorder(tree.root);
    }
}

