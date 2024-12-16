package LeetCode.Easy;

/**
 *
 */


public class Q110CheckBinaryTreeHeightBalanced {

    public static void main(String[] args) {
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(height(root.left) - height(root.right)) < 2
                && isBalanced(root.left)
                && isBalanced(root.right);
    }

    public int height(TreeNode root) {
        if (root == null) return -1;
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
