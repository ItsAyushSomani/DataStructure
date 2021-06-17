package GeeksForGeeks.LinkedList.SingleLinkedList;

/**
 *
 */

public class Q13Q14DetectandPrintLoop {

    public static void main(String[] args) {
        LinkedList.insertNodeAtLast(1);
        LinkedList.insertNodeAtLast(2);
        LinkedList.insertNodeAtLast(3);
        LinkedList.insertNodeAtLast(4);
        LinkedList.insertNodeAtLast(5);

        /*Create loop for testing */
        LinkedList.head.next.next.next.next = LinkedList.head.next;
        System.out.println(LinkedList.countNodesinLoop());
    }
}
