package Trees.BinaryTrees.Introduction;
/**
 *
 */

import Arrays.ArrayUtils;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static class Node {
        int value;
        Node left, right = null;

        Node(int value) {
            this.value = value;
        }
    }
    static Node root;


    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(
                "Inorder traversal before insertion:");
        bfs(root);
    }

    public static void bfs(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        Node temp = null;
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
            System.out.print(temp.value);
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
    }
}
