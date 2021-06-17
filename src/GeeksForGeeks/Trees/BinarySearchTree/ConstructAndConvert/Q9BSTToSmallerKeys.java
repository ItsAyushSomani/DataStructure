package GeeksForGeeks.Trees.BinarySearchTree.ConstructAndConvert;
/**
 *
 */

public class Q9BSTToSmallerKeys {
    // Java program to convert BST to binary tree
// such that sum of all smaller keys is added
// to every key

    static class Node {

        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    static class Sum {

        int addvalue = 0;
    }


    static Node root;
    Sum add = new Sum();

    // A recursive function that traverses
    // the given BST in inorder and for every
    // key, adds all smaller keys to it
    void addSmallerUtil(Node node, Sum sum) {
        // Base Case
        if (node == null) {
            return;
        }
        // Recur for left subtree first so that
        // sum of all smaller Nodes is stored at sum
        addSmallerUtil(node.left, sum);
        // Update the value at sum
        sum.addvalue = sum.addvalue + node.data;
        // Update key of this Node
        node.data = sum.addvalue;
        // Recur for right subtree so that the
        // updated sum is added to greater Nodes
        addSmallerUtil(node.right, sum);
    }

    // A wrapper over addSmallerUtil(). It
    // initializes addvalue and calls
    // addSmallerUtil() to recursively update
    // and use value of addvalue
    Node addSmaller(Node node) {
        addSmallerUtil(node, add);
        return node;
    }

    // A utility function to print inorder
    // traversal of Binary Tree
    void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    // Driver program to test the above functions
    public static void main(String[] args) {
        Q9BSTToSmallerKeys tree = new Q9BSTToSmallerKeys();
        tree.root = new Node(9);
        tree.root.left = new Node(6);
        tree.root.right = new Node(15);
        System.out.println("Original BST");
        tree.printInorder(root);
        Node Node = tree.addSmaller(root);
        System.out.println("");
        System.out.println("BST To Binary Tree");
        tree.printInorder(Node);
    }

}
