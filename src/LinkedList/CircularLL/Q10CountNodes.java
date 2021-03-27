package LinkedList.CircularLL;
/**
 *
 */

import Arrays.ArrayUtils;

public class Q10CountNodes {

    public static void main(String[] args) {
        CircularLL.Node last = null;
        last = CircularLL.insertNodeAtLast(last, 6);
        last = CircularLL.insertNodeAtFront(last, 4);
        last = CircularLL.insertNodeAtFront(last, 2);
        last = CircularLL.insertNodeAtLast(last, 8);
        last = CircularLL.insertNodeAtLast(last, 12);
//        last = addAfter(last, 10, 8);
        System.out.println(CircularLL.countNodes(last));
    }
}
