package GeeksForGeeks.Trees.BinarySearchTree.Basic;
/**
 *
 */

// Java program to demonstrate
// insert operation in binary
// search tree
public class Q1SearchingAndInsertion {
    /* Class containing left
       and right child of current node
     * and key value*/
    class Node
    {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    static Node root;

    // Constructor
    Q1SearchingAndInsertion()
    {
        root = null;
    }

    // This method mainly calls insertRec()
    void insert(int key)
    {
        root = insertRec(root, key);
    }

    /* A recursive function to
       insert a new key in BST */
    Node insertRec(Node root, int key)
    {

        /* If the tree is empty,
           return a new node */
        if (root == null)
        {
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
    void inorder()
    {
        inorderRec(root);
    }

    // A utility function to
    // do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        Q1SearchingAndInsertion tree = new Q1SearchingAndInsertion();

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
//        tree.inorder();
        if(searchBST(root, 60)) {
            System.out.println("Node Present");
        } else {
            System.out.println("Node not Present");
        }
    }

    private static boolean searchBST(Node root,int i) {
        if(root == null) {
            return false;
        }
        if(root.key == i) return true;
        if(root.key > i) {
            return searchBST(root.left, i);
        } else {
            return searchBST(root.right, i);
        }
    }
}
// This code is contributed by Ankur Narain Verma
