package LeetCode.Easy;
/**
 *Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 */

//Learning - Always handle null case.

public class Q83RemoveDuplicatesFromLinkedList {

    public static void main(String[] args) {
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode prev = head;
        ListNode next = head;
        while(next.next != null) {
            next = next.next;
            if(prev.val == next.val) {
                prev.next = next.next;
            } else {
                prev = next;
            }
        }
        return head;
    }
}
