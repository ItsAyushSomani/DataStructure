package GeeksForGeeks.Trees.BinarySearchTree.Basic;
/**
 *
 */

public class Q2DeleteFromBST {

    class Node {
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
        Q2DeleteFromBST tree = new Q2DeleteFromBST();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        // print inorder traversal of the BST
        inorder();
        root = delete(root, 60);
        System.out.println();
        inorder();

    }

    private static Node delete(Node root, int i) {
        if (root == null || root.key == i) {
            return null;
        }
        if (root.key == i) {
            if (root.left == null && root.right == null) return null;
            if (root.left != null && root.right != null) {
                root.key = maxValue(root.left);
                delete(root.left, root.key);
                return root;
            }
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
        }
        if (root.key > i) {
            root.left = delete(root.left, i);
        }
        if (root.key < i) {
            root.right = delete(root.right, i);
        }
        return root;
    }


    static int maxValue(Node root) {
        int maxv = root.key;
        while (root.right != null) {
            maxv = root.right.key;
            root = root.right;
        }
        return maxv;
    }
}
