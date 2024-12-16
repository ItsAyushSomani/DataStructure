package GeeksForGeeks.Trees.BinaryTrees.Traversals;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

import static GeeksForGeeks.Trees.BinaryTrees.Traversals.Q1Q2Q3.root;

/**
 * List<List<Integer>> result = new ArrayList<>();
 *         Queue<TreeNode> q = new LinkedList<>();
 *         if(root == null) {
 *             return new ArrayList();
 *         }
 *         q.add(root);
 *         while(!q.isEmpty()) {
 *             int levelSize =  q.size();
 *             List<Integer> tempArr = new ArrayList<>();
 *             for(int i=0; i<levelSize; i++) {
 *                 TreeNode temp = q.poll();
 *                 if(temp != null) {
 *                     tempArr.add(temp.val);
 *                     if(temp.left != null) q.add(temp.left);
 *                     if(temp.right != null) q.add(temp.right);
 *                 }
 *             }
 *             result.add(tempArr);
 *         }
 *         return result;
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

    public static void levelTraversal(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>( );
        q.add(root);

        while(!q.isEmpty()) {
            int levelSize = q.size();
            for(int i = 0; i < levelSize; i++) {
                Node temp = q.poll();
                System.out.print(temp.value);
                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);

            }
            System.out.println();

        }
    }

    public static void levelOrderZigZagTraversal(Node root) {
        if (root == null) {
            return;
        }
        Deque<Node> q = new LinkedList<>();
        boolean directionRight =  true;
        q.add(root);
        q.add(null);
        Node temp;
        while (!q.isEmpty()) {
            if(directionRight) {
                temp = q.pollFirst();
            } else {
                temp = q.pollLast();
            }
            if(temp != null) {
                System.out.print(temp.value + " ");
                if(directionRight) {
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
    public static Vector<Integer> zigZagTraversal(Node root)
    {
        Deque<Node> q = new LinkedList<Node>();
        Vector<Integer> v = new Vector<Integer>();
        q.add(root);
        v.add(root.value);
        Node temp;

        // set initial level as 1, because root is
        // already been taken care of.
        int l = 1;

        while (q.size() > 0) {
            int n = q.size();

            for (int i = 0; i < n; i++) {

                // popping mechanism
                if (l % 2 == 0) {
                    temp = q.peekLast();
                    q.pollLast();
                }
                else {
                    temp = q.peekFirst();
                    q.pollFirst();
                }

                // pushing mechanism
                if (l % 2 != 0) {

                    if (temp.right != null) {
                        q.add(temp.right);
                        v.add(temp.right.value);
                    }
                    if (temp.left != null) {
                        q.add(temp.left);
                        v.add(temp.left.value);
                    }
                }
                else if (l % 2 == 0) {

                    if (temp.left != null) {
                        q.offerFirst(temp.left);
                        v.add(temp.left.value);
                    }
                    if (temp.right != null) {
                        q.offerFirst(temp.right);
                        v.add(temp.right.value);
                    }
                }
            }
            l++; // level plus one
        }
        return v;
    }
    static Node root;

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        levelOrderTraversal(root);
        levelTraversal(root);
//        levelOrderZigZagTraversal(root);
    }
}
