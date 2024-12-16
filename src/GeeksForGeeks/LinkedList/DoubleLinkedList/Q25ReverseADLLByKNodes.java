package GeeksForGeeks.LinkedList.DoubleLinkedList;
/**
 *
 */

public class Q25ReverseADLLByKNodes {
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
        head = reverseByKNodes(head, 2);
        System.out.println("After revere");
        DoubleLinkedList.printList(head);
    }

    public static DoubleLinkedList.Node reverseByKNodes(DoubleLinkedList.Node head, int k) {
        DoubleLinkedList.Node prev = null;
        DoubleLinkedList.Node curr = head;
        int count = 0;
        while (curr != null && count < k) {
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
            count++;
        }
        return head = curr;

    }
}
