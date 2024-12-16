import GeeksForGeeks.LinkedList.SingleLinkedList.LinkedList;

/**
 * 3 2 1 4 5 6 7 8 9
 * 3 2 1 6 5 4 9 8 7
 * 1 2 => 2 1*/


//temp = 4
// 3-> 2 -> 1
    //prev = 4
    //curr = 5
public class ReverseLinkedListInK {

    public static void main(String[] args) {
    }

    public static LinkedList.Node reverseLinkedListK(LinkedList.Node head, int k) {
        if(head == null || head.next == null) {
            return head;

        }
        LinkedList.Node prev = head;
        LinkedList.Node curr = head.next;
        LinkedList.Node tail = head;
        int count  = 1;
        boolean headCondition = true;
        while(curr != null) {
            if(count == k) {
                if(headCondition) {
                    head = prev;
                    headCondition = false;
                }
                tail.next = curr;
                tail = prev;
                prev = curr;
                curr = curr.next;
                count = 1;

            } else { // 1 2
                LinkedList.Node temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            count++;
        }
        if(headCondition) {
            head = prev;
        }
        return head;
    }

}
