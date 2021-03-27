package LinkedList.SingleLinkedList;
/**
 *
 */

import Arrays.ArrayUtils;

public class Q25ReverseLinkedList {


    public static void main(String[] args) {
        LinkedList.insertNodeAtFront(85);
        LinkedList.insertNodeAtFront(15);
        LinkedList.insertNodeAtFront(4);
        LinkedList.insertNodeAtFront(20);
        System.out.println("Given Linked list");
        LinkedList.printList();
        LinkedList.head = LinkedList.reverse();
        System.out.println("");
        System.out.println("Reversed linked list ");
        LinkedList.printList();
    }
}
