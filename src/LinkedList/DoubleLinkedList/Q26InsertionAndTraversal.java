package LinkedList.DoubleLinkedList;
/**
 *
 */

public class Q26InsertionAndTraversal {

    public static void main(String[] args) {
        /* Start with the empty list */
        CircularDoubleLinkedList.Node head = null;
        // Insert 5. So linked list becomes 5.null
        head = CircularDoubleLinkedList.insertNodeAtLast(head, 5);
        // Insert 4 at the beginning. So linked
        // list becomes 4.5
        head = CircularDoubleLinkedList.insertNodeAtFront(head, 4);
        // Insert 7 at the end. So linked list
        // becomes 4.5.7
        head = CircularDoubleLinkedList.insertNodeAtLast(head, 7);
        // Insert 8 at the end. So linked list
        // becomes 4.5.7.8
        head = CircularDoubleLinkedList.insertNodeAtLast(head, 8);
        // Insert 6, after 5. So linked list
        // becomes 4.5.6.7.8
        System.out.printf("Created circular doubly linked list is: ");
        CircularDoubleLinkedList.printList(head);
    }
}
