package Trees.BinaryTrees.Traversals;
/**
 *
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q1Q2Q3 {

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
        int key = 12;
//        insert(root, key);
        System.out.println(
                "\nInorder traversal after insertion:");
        inorder(root);
        System.out.println(
                "\nInorder traversal after insertion: without recursion");
        inorderWithoutRecurrsion(root);
    }


    private static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

    private static void inorderWithoutRecurrsion(Node root) {
        if (root == null)
            return;
        Stack<Node> s = new Stack<Node>();
        Node curr = root;
        // traverse the tree
        while (curr != null || s.size() > 0) {

			/* Reach the left most Node of the
			curr Node */
            while (curr != null) {
				/* place pointer to a tree node on
				the stack before traversing
				the node's left subtree */
                s.push(curr);
                curr = curr.left;
            }

            /* Current must be NULL at this point */
            curr = s.pop();
            System.out.print(curr.value + " ");

			/* we have visited the node and its
			left subtree. Now, it's right
			subtree's turn */
            curr = curr.right;
        }
    }

    private static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        inorder(root.left);
        inorder(root.right);
    }

    private static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
    }
}
