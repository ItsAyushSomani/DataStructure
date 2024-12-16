package GeeksForGeeks.LinkedList.DoubleLinkedList;
/**
 *
 */

public class Q15DeleteAllOccurenceOfKey {

    public static void main(String[] args) {
        DoubleLinkedList.Node head = null;
        head = DoubleLinkedList.insertNodeAtFront(head, 12);
        head = DoubleLinkedList.insertNodeAtFront(head, 5);
        head = DoubleLinkedList.insertNodeAtFront(head, 2);
        head = DoubleLinkedList.insertNodeAtFront(head, 4);
        head = DoubleLinkedList.insertNodeAtFront(head, 8);
        head = DoubleLinkedList.insertNodeAtFront(head, 10);
        head = DoubleLinkedList.insertNodeAtFront(head, 2);
        head = DoubleLinkedList.insertNodeAtFront(head, 2);
        System.out.println("Original Doubly GeeksForGeeks.LinkedList");
        DoubleLinkedList.printList(head);

        /* remove duplicate nodes */
        int X = 2;
        head = deleteAllOccurOfX(head, X);
        System.out.println("\nDoubly linked list after removing duplicates:");
        DoubleLinkedList.printList(head);
    }

    private static DoubleLinkedList.Node deleteAllOccurOfX(DoubleLinkedList.Node head, int X) {
        DoubleLinkedList.Node curr = head;
        DoubleLinkedList.Node next = head.next;
        while (next != null) {
            if (head.data == X) {
                head = head.next;
            }
            if (next.data != X) {
                curr.next = next;
                curr = next;
            }
            next = next.next;
        }
        return head;
    }
}
