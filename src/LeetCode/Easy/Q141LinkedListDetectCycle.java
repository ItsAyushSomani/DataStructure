package LeetCode.Easy;
/**
 *
 */

import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Q141LinkedListDetectCycle {

    public static void main(String[] args) {
    }

    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> nodeSet = new HashSet<>();
        while (head != null) {
            if (!nodeSet.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
