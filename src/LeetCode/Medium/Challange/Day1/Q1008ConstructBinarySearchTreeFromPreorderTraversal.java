
//Given an array of integers preorder, which represents the preorder traversal of a BST (i.e., binary search tree), construct the tree and return its root.
//
//It is guaranteed that there is always possible to find a binary search tree with the given requirements for the given test cases.
//
//A binary search tree is a binary tree where for every node, any descendant of Node.left has a value strictly less than Node.val, and any descendant of Node.right has a value strictly greater than Node.val.
//
//A preorder traversal of a binary tree displays the value of the node first, then traverses Node.left, then traverses Node.right.
//
//
//
//        Example 1:
//
//
//Input: preorder = [8,5,1,7,10,12]
//Output: [8,5,10,1,7,null,12]
//Example 2:
//
//Input: preorder = [1,3]
//Output: [1,null,3]
//
//
//Constraints:
//
//        1 <= preorder.length <= 100
//        1 <= preorder[i] <= 1000
//All the values of preorder are unique.


package LeetCode.Medium.Challange.Day1;

import GeeksForGeeks.Trees.BinaryTrees.Introduction.TreeNode;

public class Q1008ConstructBinarySearchTreeFromPreorderTraversal {



    public static TreeNode preOrderTrav( int[] preOrder, int maxVal, int[] currElement) {
        if (currElement[0] >= preOrder.length || preOrder[currElement[0]] > maxVal) {
            return null;
        }

        TreeNode tree = new TreeNode(preOrder[currElement[0]++]);
        tree.left = preOrderTrav(preOrder, tree.val, currElement);
        tree.right = preOrderTrav(preOrder, maxVal, currElement);

        return tree;
    }

    public static void main(String[] args) {
        int[] preOrder = new int[]{8, 5, 1, 7, 10, 12};
        TreeNode tree = new TreeNode();
        System.out.println(preOrderTrav(preOrder, Integer.MAX_VALUE, new int[]{0}));
    }
}

//There are three methods to solve this problem
//
//1. Traverse like preorder and start inserting one element while looping
//2. Calculate inorder by sorting and then make tree from inorder and preOrder
//3. having maxvalue, in left tree current will be the maxValue and in right tree parent will be the maxValue starting from Integer.MAX_VALUE