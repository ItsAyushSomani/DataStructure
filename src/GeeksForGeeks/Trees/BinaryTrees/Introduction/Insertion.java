package GeeksForGeeks.Trees.BinaryTrees.Introduction;
/**
 *
 */

import java.util.LinkedList;
import java.util.Queue;

public class Insertion {
    static class Node {
        int value;
        Node left, right = null;

        Node(int value) {
            this.value = value;
        }
    }

    static Node root;
    static Node temp = root;

    static void insert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            if (temp.left != null) {
                q.add(temp.left);
            } else {
                temp.left = new Node(key);
                return;
            }
            if (temp.right != null) {
                q.add(temp.right);
            } else {
                temp.right = new Node(key);
                return;
            }
        }
    }

    static void deleteNodeAndShift(Node root, int key) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (root.value == key) {
                root = null;
                return;
            } else {
                return;
            }
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        Node temp = null, keyNode = null;
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
            if (temp.value == key) {
                keyNode = temp;
            }
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
        if (keyNode != null) {
            keyNode.value = temp.value;
            deleteDeepest(root);
        }

    }

    static void deleteDeepest(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        Node temp = null;
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
        temp = null;
    }

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
        insert(root, key);
        System.out.println(
                "\nInorder traversal after insertion:");
        deleteNodeAndShift(root, 11);
        inorder(root);
    }


    private static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
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
