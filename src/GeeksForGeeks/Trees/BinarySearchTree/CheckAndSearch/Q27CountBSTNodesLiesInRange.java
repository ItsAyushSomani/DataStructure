package GeeksForGeeks.Trees.BinarySearchTree.CheckAndSearch;
/**
 *
 */

public class Q27CountBSTNodesLiesInRange {

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
        Q27CountBSTNodesLiesInRange tree = new Q27CountBSTNodesLiesInRange();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(1);
        tree.insert(5);
        tree.insert(10);
        tree.insert(40);
        tree.insert(50);
        tree.insert(100);
        // print inorder traversal of the BST
        inorder();
//        root = delete(root, 60);
        System.out.println();
        int l = 5;
        int h = 45;
        System.out.println("Count of nodes between [" + l + ", "
                + h + "] is " + tree.getCount(tree.root,
                l, h));
    }

    private int getCount(Node root, int l, int h) {
        if (root == null) return 0;
        if (root.key >= l && root.key <= h) {
            return 1 + getCount(root.left, l, h) + getCount(root.right, l, h);
        }
        if (root.key >= h) {
            return getCount(root.left, l, h);
        } else {
            return getCount(root.right, l, h);
        }

    }
}
