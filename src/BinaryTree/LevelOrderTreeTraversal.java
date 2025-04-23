package BinaryTree;
import java.util.*;
public class LevelOrderTreeTraversal {
    public static class Node {
        int data;
        Node left, right;

        Node (int data) {
            this.data = data;
            this.left = null;
            this.left = null;
        }
    }

    public static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int[] nodes) {
            idx++;

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void levelOrder(Node root) {

            if (root == null) {
                return;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null);

            while (!queue.isEmpty()) {
                Node currNode = queue.remove();
                if (currNode == null) {
                    System.out.println();

                    if (queue.isEmpty()) {
                        break;
                    } else {
                        queue.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        queue.add(currNode.left);
                    }

                    if (currNode.right != null) {
                        queue.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);
        BinaryTree.levelOrder(root);
    }
}
