package GeeksForGeeks.Trees.BinaryTrees.Traversals;

import java.util.*;

/**
 *
 */
public class ZigzagTraversal {
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
            Node temp = q.poll();
            System.out.print(temp.value + " ");

            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
    }

    public static void levelOrderZigZagTraversal(Node root) {
        if (root == null) {
            return;
        }
        Deque<Node> q = new LinkedList<>();
        boolean directionRight = true;
        q.add(root);
        q.add(null);
        Node temp;
        while (!q.isEmpty()) {
            if (directionRight) {
                temp = q.pollFirst();
            } else {
                temp = q.pollLast();
            }
            if (temp != null) {
                System.out.print(temp.value + " ");
                if (directionRight) {
                    if (temp.left != null) {
                        q.add(temp.left);
                    }
                    if (temp.right != null) {
                        q.add(temp.right);
                    }
                } else {
                    if (temp.left != null) {
                        q.add(temp.left);
                    }
                    if (temp.right != null) {
                        q.add(temp.right);
                    }
                }
            } else {
                q.add(null);
                directionRight = !directionRight;
            }

        }
    }

    public static void zigZagTraversal(Node root) {
        Stack<Node> q = new Stack<>();
        Stack<Node> stack = new Stack<>();
        q.add(root);
        boolean flag = true;

        while (q.size() > 0) {

            Node temp = q.pop();
            System.out.println(temp.value);
            if (flag) {
                if (temp.left != null)
                    stack.add(temp.left);
                if (temp.right != null)
                    stack.add(temp.right);
            } else {
                if (temp.right != null)
                    stack.add(temp.right);
                if (temp.left != null)
                    stack.add(temp.left);
            }

            if (q.isEmpty()) {
                Stack tempStack = stack;
                stack = q;
                q = tempStack;
                flag = !flag;
            }
        }

    }

    public static void zigZagTraversalDeQue(Node root) {

        Deque<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int l = 1;
        Node temp;
        while (q.size() > 0) {
            if (l % 2 != 0) {
                temp = q.pollFirst();
            } else {
                temp = q.pollLast();
            }
            if (temp != null) {
                System.out.println(temp.value);
                if (l % 2 != 0) {
                    if (temp.right != null)
                        q.add(temp.right);
                    if (temp.left != null)
                        q.add(temp.left);
                } else {

                    if (temp.right != null)
                        q.addFirst(temp.right);
                    if (temp.left != null)
                        q.addFirst(temp.left);
                }
            } else {
                q.add(null);
                l++;
            }
        }
        }

        static Node root;

        public static void main (String[]args){
            root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);
            root.right.right.left = new Node(8);
            root.right.right.right = new Node(9);
//        levelOrderTraversal(root);
            zigZagTraversalDeQue(root);
        }
    }
