package LeetCode.Easy;

/**
 *Given the root of a binary tree, return its maximum depth.
 *
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 * Example 2:
 *
 * Input: root = [1,null,2]
 * Output: 2
 * Example 3:
 *
 * Input: root = []
 * Output: 0
 * Example 4:
 *
 * Input: root = [0]
 * Output: 1
 */

public class Q104MaximumDepthOfBinaryTree {

    public static void main(String[] args) {
        int arr[] = {};
    }

    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }

    public int maxDepth(TreeNode root, int i) {
        if (root == null) return i;
        i++;
        return Math.max(maxDepth(root.left, i), maxDepth(root.right, i));
    }
}
