package GeeksForGeeks.LinkedList.SingleLinkedList;
/**
 *
 */

public class Q4Q5Q6DeleteANode {

    public static void main(String[] args) {
        // Insert 6.  So linked list becomes 6->NUllist
        LinkedList.insertNodeAtFront(6);
        // Insert 7 at the beginning. So linked list becomes
        // 7->6->NUllist
        LinkedList.insertNodeAtFront(7);
        // Insert 1 at the beginning. So linked list becomes
        // 1->7->6->NUllist
        LinkedList.insertNodeAtFront(1);
        // Insert 4 at the end. So linked list becomes
        // 1->7->6->4->NUllist
        LinkedList.insertNodeAtLast(4);
        // Insert 8, after 7. So linked list becomes
        // 1->7->8->6->4->NUllist
        LinkedList.insertNodeAfterANode(LinkedList.head.next, 8);
        LinkedList.deleteNode(8);
        System.out.println("\n After deleteNode list is: ");
        LinkedList.printList();
        LinkedList.deleteNodeAtGivenPosition(0);
        System.out.println("\n After deleteNodeAtGivenPosition list is: ");
        LinkedList.printList();
        LinkedList.deleteList();
        System.out.println("\nAfter List Delete: ");
        LinkedList.printList();
    }

}
