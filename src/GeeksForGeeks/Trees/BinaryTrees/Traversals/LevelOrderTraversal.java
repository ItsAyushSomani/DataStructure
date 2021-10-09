package GeeksForGeeks.Trees.BinaryTrees.Traversals;

import javax.sound.sampled.Line;
import java.util.LinkedList;
import java.util.Queue;

import static GeeksForGeeks.Trees.BinaryTrees.Traversals.Q1Q2Q3.root;

/**
 *
 */
public class LevelOrderTraversal {
    static class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    public static void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.peek();
            q.remove();
            System.out.print(temp.value + " ");
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
    }

    static Node root;

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        levelOrderTraversal(root);
    }
}
