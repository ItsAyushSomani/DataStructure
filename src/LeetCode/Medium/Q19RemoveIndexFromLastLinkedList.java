package LeetCode.Medium;


/**
 *
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}


public class Q19RemoveIndexFromLastLinkedList {

    public static void main(String[] args) {
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) return null;
        ListNode next = head;
        ListNode prev = head;
        while (next.next != null) {
            if (n > 0) {
                next = next.next;
                n--;
            } else {
                next = next.next;
                prev = prev.next;
            }
        }
        if (n > 0) {
            head = head.next;
        } else {
            prev.next = prev.next.next;
        }
        return head;
    }
}
