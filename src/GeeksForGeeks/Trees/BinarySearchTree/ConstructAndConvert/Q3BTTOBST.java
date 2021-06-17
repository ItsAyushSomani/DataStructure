package GeeksForGeeks.Trees.BinarySearchTree.ConstructAndConvert;
/**
 *
 */

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Q3BTTOBST {
    static class Node {
        int value;
        Node left, right = null;

        Node(int value) {
            this.value = value;
        }
    }

    static Node root;
    static Node temp = root;


    // Driver code
    public static void main(String args[]) {
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
        System.out.println(
                "Inorder traversal before insertion:");
        inorder(root);
        System.out.println(
                "\nInorder traversal after Binary Tree to BST");
        root = btToBST(root);
        inorder(root);

    }

    private static Node btToBST(Node root) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        getInorder(root, list);
        Collections.sort(list);
        Queue<Integer> q = list;
        fillInorder(root, q);
        return root;
    }

    private static void fillInorder(Node root, Queue<Integer> q) {
        if (root == null) {
            return;
        }
        fillInorder(root.left, q);
        root.value = q.poll();
        fillInorder(root.right, q);
    }

    private static void getInorder(Node root, Queue q) {
        if (root == null) {
            return;
        }
        getInorder(root.left, q);
        q.add(root.value);
        getInorder(root.right, q);
    }

    private static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }
}
