package Trees.BinarySearchTree.CheckAndSearch;

/**
 *
 */

public class Q5Q14CheckBTisBSTandDeadEnd {

    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    static Node root = null;

    // This method mainly calls insertRec()
    void insert(int key) {
        root = insertRec(root, key);
    }

    /* A recursive function to
       insert a new key in BST */
    Node insertRec(Node root, int key) {

        /* If the tree is empty,
           return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

    // This method mainly calls InorderRec()
    static void inorder() {
        inorderRec(root);
    }

    // A utility function to
    // do inorder traversal of BST
    static void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(" " + root.key);
            inorderRec(root.right);
        }
    }

    // Driver Code
    public static void main(String[] args) {
        Q5Q14CheckBTisBSTandDeadEnd tree = new Q5Q14CheckBTisBSTandDeadEnd();
        tree.root = new Node(3);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
//        tree.root.left.right = new Node(4);
        if (tree.isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
        tree.insert(8);
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(7);
        tree.insert(11);
        tree.insert(4);
        if (tree.deadEnd(tree.root, 1,
                Integer.MAX_VALUE) == true)
            System.out.println("Yes ");
        else
            System.out.println("No ");
    }

    static boolean isBST(Node root, int l, int r) {
        // Base condition
        if (root == null)
            return true;
        // if left node exist then check it has
        // correct data or not i.e. left node's data
        // should be less than root's data
        if (root.key < l || root.key > r)
            return false;
        // check recursively for every node.
        return isBST(root.left, l, root.key - 1) &&
                isBST(root.right, root.key + 1, r);
    }

    static boolean deadEnd(Node root, int l, int r) {
        // Base condition
        if (root == null)
            return false;
        // if left node exist then check it has
        // correct data or not i.e. left node's data
        // should be less than root's data
        if (l == r)
            return true;
        // check recursively for every node.
        return isBST(root.left, l, root.key - 1) &&
                isBST(root.right, root.key + 1, r);
    }

}
