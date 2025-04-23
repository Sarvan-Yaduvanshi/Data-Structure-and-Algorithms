package BinaryTree.TypesOfBinaryTree;
import java.util.*;

class PerfectBinaryTree {
    // Function to create a perfect binary tree from a given range of array values
    public TreeNode buildPerfectBinaryTree(int[] values, int start, int end) {
        // Base case: If no elements are left to include in the tree
        if (start > end) {
            return null;
        }

        // Find the middle element to keep the tree balanced
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(values[mid]);

        // Recursively build the left and right subtrees
        root.left = buildPerfectBinaryTree(values, start, mid - 1);
        root.right = buildPerfectBinaryTree(values, mid + 1, end);

        return root;
    }

    // Helper function to initiate the tree creation with the entire array
    public TreeNode createPerfectBinaryTree(int[] values) {
        if (values == null || values.length == 0) {
            return null;  // If the array is empty, return null
        }

        return buildPerfectBinaryTree(values, 0, values.length - 1);
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
        PerfectBinaryTree treeBuilder = new PerfectBinaryTree();

        // Example array to create a perfect binary tree (must have 2^h - 1 elements for a perfect binary tree)
        int[] values = {1, 2, 3, 4, 5, 6, 7};

        // Create the perfect binary tree
        TreeNode root = treeBuilder.createPerfectBinaryTree(values);

        // Print the level-order traversal of the perfect binary tree
        System.out.print("Level-order traversal: ");
        treeBuilder.printLevelOrder(root);
    }
}


