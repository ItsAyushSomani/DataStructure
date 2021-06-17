package LinkedList.DoubleLinkedList;
/**
 *
 */

public class Q14RemoveDuplicateFromSortedList {

    public static void main(String[] args) {
        DoubleLinkedList.Node head = null;
        head = DoubleLinkedList.insertNodeAtFront(head, 12);
        head = DoubleLinkedList.insertNodeAtFront(head, 12);
        head = DoubleLinkedList.insertNodeAtFront(head, 10);
        head = DoubleLinkedList.insertNodeAtFront(head, 8);
        head = DoubleLinkedList.insertNodeAtFront(head, 8);
        head = DoubleLinkedList.insertNodeAtFront(head, 6);
        head = DoubleLinkedList.insertNodeAtFront(head, 4);
        head = DoubleLinkedList.insertNodeAtFront(head, 4);
        head = DoubleLinkedList.insertNodeAtFront(head, 4);
        head = DoubleLinkedList.insertNodeAtFront(head, 4);
        System.out.println("Original Doubly LinkedList");
        DoubleLinkedList.printList(head);

        /* remove duplicate nodes */
        head = removeDuplicates(head);
        System.out.println("\nDoubly linked list after removing duplicates:");
        DoubleLinkedList.printList(head);
    }

    private static DoubleLinkedList.Node removeDuplicates(DoubleLinkedList.Node head) {
        DoubleLinkedList.Node curr = head;
        DoubleLinkedList.Node next = head.next;
        while (next.next != null) {
            if (curr.data != next.data) {
                curr.next = next;
                curr = next;
            }
            next = next.next;
        }
        curr.next = null;
        return head;
    }
}
