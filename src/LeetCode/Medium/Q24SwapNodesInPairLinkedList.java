package LeetCode.Medium;

/**
 *
 */


public class Q24SwapNodesInPairLinkedList {

    public static void main(String[] args) {
        int arr[] = {};
        System.out.println(-8 / -2);
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode prev = head;
        ListNode next = head.next;
        ListNode temp = null;
        boolean flag = true;
        while (next != null) {
            prev.next = next.next;
            next.next = prev;
            if (flag) {
                head = next;
                flag = false;
            } else {
                temp.next = next;
            }
            if (prev.next == null || prev.next.next == null) break;
            temp = prev;
            prev = prev.next;
            next = prev.next;
        }
        return head;
    }
}
