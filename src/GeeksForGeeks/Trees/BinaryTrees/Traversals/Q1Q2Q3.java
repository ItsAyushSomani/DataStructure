package GeeksForGeeks.Trees.BinaryTrees.Traversals;
/**
 * 10
 * 11   9
 * 7   15  8
 */

import java.util.*;

enum Type {
    LEFT,
    RIGHT
};

public class Q1Q2Q3 {
    static int pos = 0;
    static class Node {
        private final int value;
        Node left, right = null;

        Node(int value) {
            this.value = value;
        }
    }

    static Node root;


    // Driver code
    public static void main(String args[]) {
        root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
//        System.out.println(
//                "Inorder traversal before insertion:");
//        inorderWithoutRecurrsion(root);
//        inorder(root);
//        int key = 12;
//        int in1[] = { 4, 2, 5, 1, 3, 6 };
//        int pre[] = { 1, 2, 4, 5, 3, 6 };
//        int n = in1.length;
//        // Create an empty List
//        List<Integer> list = new ArrayList<>();
//
//        // Iterate through the array
//        for (Integer t : in1) {
//            // Add each element into the list
//            list.add(t);
//        }
//
//        List<Integer> list1 = new ArrayList<>();
//
//        // Iterate through the array
//        for (Integer t : pre) {
//            // Add each element into the list
//            list1.add(t);
//        }
//        Node temp = buildTree(list, list1, 0, n-1);
        System.out.println("in order");
        inorder(root);
        System.out.println();
        System.out.println("in order iterative");
        inorderT(root, 3);
        System.out.println();
        System.out.println("in order iterative 1");

//        insert(root, key);
//        System.out.println(
//                "\nInorder traversal after insertion:");
//        inOrderTraversal(root);
//        System.out.println(
//                "\nInorder traversal after insertion: without recursion");
//        inOrderTraversal(root);
//        System.out.println("Level order traversal");
//        levelOrderTraversal(root);
//        addNode(root, 10);
//        System.out.println("Level order traversal 2 ");
//        levelOrderTraversal(root);
//        addNodeToParent(root, root.left, 11, Type.RIGHT);
//        System.out.println("Level order traversal 3 ");
//        kejriwalTraversal(root);
    }


    public static void addNodeToParent(Node root, Node parent, int value, Type type) {
        if (root == null) {
            return;
        }
        if (root == parent) {
            if (type == Type.LEFT) {
                root.left = new Node(value);
            } else {
                root.right = new Node(value);
            }
        }
        addNodeToParent(root.left, parent, value, type);
        addNodeToParent(root.right, parent, value, type);
    }


    public static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.value + " ");
        inOrderTraversal(root.right);
    }


    public static Node addNode(Node root, int value) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (q.size() > 0) {
            Node temp = q.poll();
            if (temp != null) {
                if (temp.left != null) {
                    q.add(temp.left);
                } else {
                    temp.left = new Node(value);
                    break;
                }
                if (temp.right != null) {
                    q.add(temp.right);
                } else {
                    temp.right = new Node(value);
                    break;
                }
            }
        }
        return root;

    }


    public static void levelOrderTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (q.size() > 0) {
            Node temp = q.poll();
            if (temp != null) {
                System.out.print(temp.value + "  ");
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            } else {
                if (q.size() != 0) {
                    q.add(null);
                }
                System.out.println();
            }
        }

    }


    public static void kejriwalTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();
        Queue<Node> qTemp = new LinkedList<>();
        q.add(root);
        q.add(null);
        int count = 0;
        boolean flag = false;
        while (q.size() > 0) {
            Node temp = q.poll();
            qTemp.add(temp);
            if (temp != null) {
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            } else {
                if (q.size() != 0) {
                    q.add(null);
                }
                count++;
            }
            if (!flag) {
                while (!qTemp.isEmpty()) {
                    Node temp1 = qTemp.poll();
                    if (temp1 == null) {
                        System.out.println();
                    } else {
                        System.out.print(temp1.value + " ");
                    }
                }
                System.out.println();
                count = 0;
                flag = true;
            } else {
                Stack<Node> stack = new Stack<>();
                while (!qTemp.isEmpty()) {
                    stack.add(qTemp.poll());
                }
                while (!stack.isEmpty()) {
                    Node stackTemp = stack.pop();
                    if (stackTemp == null) {
                        System.out.println();
                    } else {
                        System.out.print(stackTemp.value + " ");
                    }
                }
                flag = false;
                System.out.println();
            }
        }

    }


    private static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }


    private static void inorderT(Node root, int k) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node curr = root;

        while(curr != null || stack.size() > 0) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            if(--k == 0) break;
            curr = curr.right;
        }
        System.out.println(curr.value);

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

    private void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.value + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    private static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
    }


    public static Node buildTree(List<Integer> inorder, List<Integer> preOrder, int start, int end) {
        if(start > end) {
            return null;
        }
        int mid =  search(inorder, start, end, preOrder.get(pos));
        Node temp = new Node(inorder.get(mid));
        pos++;
        temp.left = buildTree(inorder, preOrder, start,mid-1);
        temp.right = buildTree(inorder, preOrder, mid+1, end);
        return temp;
    }

    private static int search(List<Integer> inorder, int start, int end, Integer integer) {
        for(int i=0; i < inorder.size(); i++) {
            if(inorder.get(i) == integer) {
                return i;
            }
        }
        return -1;
    }

    public static int search(int[] nums, int start, int end) {
        int max = start;
        while(start < end) {
            if(nums[++start] > nums[max])
                max = start;
        }
        return max;
    }
}
