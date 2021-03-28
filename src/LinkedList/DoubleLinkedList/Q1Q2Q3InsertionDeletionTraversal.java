package LinkedList.DoubleLinkedList;
/**
 *
 */

public class Q1Q2Q3InsertionDeletionTraversal {

    public static void main(String[] args) {
        DoubleLinkedList.Node head = null;
        // Insert 6. So linked list becomes 6->NULL
        head = DoubleLinkedList.insertNodeAtLast(head, 6);
        // Insert 7 at the beginning. So
        //linked list becomes 7->6->NULL
        head = DoubleLinkedList.insertNodeAtFront(head, 7);
        // Insert 1 at the beginning. So
        // linked list becomes 1->7->6->NULL
        head = DoubleLinkedList.insertNodeAtFront(head, 1);
        // Insert 4 at the end. So linked
        // list becomes 1->7->6->4->NULL
        head = DoubleLinkedList.insertNodeAtLast(head, 4);
        // Insert 8, after 7. So linked
        // list becomes 1->7->8->6->4->NULL
//        dll.InsertAfter(dll.head.next, 8);
        System.out.println("Created DLL is: ");
        DoubleLinkedList.printList(head);
        head = DoubleLinkedList.deleteNode(head, head);
        System.out.println("After Deletion");
        DoubleLinkedList.printList(head);
        head = DoubleLinkedList.reverse(head);
        System.out.println("After revere");
        DoubleLinkedList.printList(head);
    }
}
