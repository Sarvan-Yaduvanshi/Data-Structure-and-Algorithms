package BinaryTree;
import java.util.*;
public class TopViewOfaTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info {
        Node node;
        int HD;    //  HD --> Horizontal Distance

        public Info(Node node, int HD) {
            this.node = node;
            this.HD = HD;
        }
    }

    public static void topView(Node root) {
        // Level Order

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.HD)) { // first time my HD is occurring
                    map.put(curr.HD, curr.node);
                }

                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.HD - 1));
                    min = Math.min(min, curr.HD - 1);
                }

                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.HD + 1));
                    max = Math.max(max, curr.HD + 1);
                }
            }
        }
           for (int i = min; i <= max; i++) {
               System.out.print(map.get(i).data + " ");
           }
           System.out.println();
    }

    public static void main(String[] args) {

        /*

                1
               / \
              2    3
            /  \  /  \
           4    5 6   7

         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        topView(root);
    }
}
