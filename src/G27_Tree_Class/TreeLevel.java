package G27_Tree_Class;
import java.util.*;
public class TreeLevel {
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int val) {
            data = val;
            left = right = null;
        }
    }

   public static void printLevel(TreeNode root, int k) {
        // Base case
        if (root == null) return;

        if (k == 1) {
            System.out.println(root.data + " ");
        } else {
            printLevel(root.left, k - 1);
            printLevel(root.right, k - 1);
        }
   }

   public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(70);

        printLevel(root, 2);
   }
}
