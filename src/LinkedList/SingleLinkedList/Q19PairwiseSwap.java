package LinkedList.SingleLinkedList;
/**
 *
 */

public class Q19PairwiseSwap {

    public static void main(String[] args) {

        /* Created Linked List 1->2->3->4->5 */
        LinkedList.insertNodeAtFront(5);
        LinkedList.insertNodeAtFront(4);
        LinkedList.insertNodeAtFront(3);
        LinkedList.insertNodeAtFront(2);
        LinkedList.insertNodeAtFront(1);

        System.out.println("Linked List before calling pairWiseSwap() ");
        LinkedList.printList();

        LinkedList.pairWiseSwap(LinkedList.head);

        System.out.println("Linked List after calling pairWiseSwap() ");
        LinkedList.printList();
    }

}
