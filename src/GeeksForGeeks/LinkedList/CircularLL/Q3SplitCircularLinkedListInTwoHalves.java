package GeeksForGeeks.LinkedList.CircularLL;
/**
 *
 */

import java.util.ArrayList;

public class Q3SplitCircularLinkedListInTwoHalves {

    public static void main(String[] args) {
        CircularLL.Node last = null;
        last = CircularLL.insertNodeAtLast(last, 6);
        last = CircularLL.insertNodeAtFront(last, 4);
        last = CircularLL.insertNodeAtFront(last, 2);
        last = CircularLL.insertNodeAtLast(last, 8);
        last = CircularLL.insertNodeAtLast(last, 12);
//        last = addAfter(last, 10, 8);
        splitList(last, 2);
    }

    private static ArrayList<CircularLL.Node> splitList(CircularLL.Node last, int i) {
        CircularLL.Node slow_ptr = last.next;
        CircularLL.Node fast_ptr = last.next.next;
        while (fast_ptr.next != last.next
                && fast_ptr.next.next != last.next) {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }
        if (fast_ptr.next.next == last.next) {
            fast_ptr = fast_ptr.next;
        }
        return new ArrayList();
    }
}
