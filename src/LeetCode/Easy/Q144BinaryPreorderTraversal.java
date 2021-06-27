package LeetCode.Easy;
//Given the root of a binary tree, return the preorder traversal of its nodes' v
//alues.
//
//
// Example 1:
//
//
//Input: root = [1,null,2,3]
//Output: [1,2,3]
//
//
// Example 2:
//
//
//Input: root = []
//Output: []
//
//
// Example 3:
//
//
//Input: root = [1]
//Output: [1]
//
//
// Example 4:
//
//
//Input: root = [1,2]
//Output: [1,2]
//
//
// Example 5:
//
//
//Input: root = [1,null,2]
//Output: [1,2]
//
//
//
// Constraints:
//
//
// The number of nodes in the tree is in the range [0, 100].
// -100 <= Node.val <= 100
//
//
//
// Follow up: Recursive solution is trivial, could you do it iteratively?
// Related Topics Stack Tree Depth-First Search Binary Tree
// 👍 2445 👎 91
//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Q144BinaryPreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorderTraversal1(root, list);
        return list;
    }

    public void preorderTraversal1(TreeNode root, List list) {
        if (root == null) return;
        list.add(root.val);
        preorderTraversal1(root.left, list);
        preorderTraversal1(root.right, list);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

