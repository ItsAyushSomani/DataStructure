package Trees.BinarySearchTree.ConstructAndConvert;
/**
 *
 */

import Arrays.ArrayUtils;

public class Q5SortedArrayToBST {
    class Node {

        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    static Node root;

    public static void main(String[] args) {
        Q5SortedArrayToBST tree = new Q5SortedArrayToBST();
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        root = tree.sortedArrayToBST(arr, 0, n - 1);
        System.out.println("Preorder traversal of constructed BST");
        tree.inorder(root);
    }

    private Node sortedArrayToBST(int[] arr, int l, int r) {
        if (l > r) return null;
        int mid = (l + r) / 2;
        Node root = new Node(arr[mid]);
        root.left = sortedArrayToBST(arr, l, mid - 1);
        root.right = sortedArrayToBST(arr, mid + 1, r);
        return root;
    }

    private static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

}
