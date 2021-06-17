package LeetCode.Easy;
/**
 *
 */

import LinkedList.SingleLinkedList.LinkedList;

public class Q21MergeTwoList {

    public static void main(String[] args) {
    }

    public LinkedList.Node mergeTwoLists(LinkedList.Node l1, LinkedList.Node l2) {
        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                l1 = l1.next;
            } else {
                LinkedList.Node temp = l2;
                temp.next = l1.next;
                l1.next = temp;
                l2 = l2.next;
            }
        }
        return l1;
    }
}
