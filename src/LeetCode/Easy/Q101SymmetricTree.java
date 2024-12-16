package LeetCode.Easy;
/**
 *Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [1,2,2,3,4,4,3]
 * Output: true
 * Example 2:
 *
 *
 * Input: root = [1,2,2,null,3,null,3]
 * Output: false
 */


public class Q101SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return isSymmetricTree(root.left, root.right);
    }

    public boolean isSymmetricTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if ((p == null && q != null) || (p != null && q == null)) return false;
        if (p.val != q.val) return false;
        return isSymmetricTree(p.left, q.right) && isSymmetricTree(p.right, q.left);
    }
}
