package LeetCode.Easy;

/**
 *
 */
public class Q108SortedArrayToBinaryTree {

    public static void main(String[] args) {
    }

    public TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (end < start) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);
        return root;
    }
}
