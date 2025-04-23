package BinaryTree.TypesOfBinaryTree;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    // Constructor for the TreeNode class
    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class CompleteBinaryTree {

    // Function to create a complete binary tree from an array of values
    public TreeNode createCompleteBinaryTree(int[] values) {
        if (values == null || values.length == 0) {
            return null;  // If the input array is empty, return null
        }

        List<TreeNode> nodes = new ArrayList<>();

        // Create TreeNode instances for each value
        for (int value : values) {
            nodes.add(new TreeNode(value));
        }

        // Assign children to each node based on their index
        for (int i = 0; i < nodes.size(); i++) {
            TreeNode current = nodes.get(i);

            // Calculate left child index: 2*i + 1
            int leftIndex = 2 * i + 1;
            if (leftIndex < nodes.size()) {
                current.left = nodes.get(leftIndex);
            }

            // Calculate right child index: 2*i + 2
            int rightIndex = 2 * i + 2;
            if (rightIndex < nodes.size()) {
                current.right = nodes.get(rightIndex);
            }
        }

        // The root of the tree is the first element in the list
        return nodes.get(0);
    }

    // Function to print level-order traversal of the tree
    public void printLevelOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CompleteBinaryTree treeBuilder = new CompleteBinaryTree();

        // Input array to create a complete binary tree
        int[] values = {1, 2, 3, 4, 5, 6, 7};

        // Creating the complete binary tree
        TreeNode root = treeBuilder.createCompleteBinaryTree(values);

        // Printing the level-order traversal of the complete binary tree
        System.out.print("Level-order traversal: ");
        treeBuilder.printLevelOrder(root);
    }
}
