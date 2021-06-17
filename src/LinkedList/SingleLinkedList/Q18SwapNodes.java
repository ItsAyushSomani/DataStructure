package LinkedList.SingleLinkedList;
/**
 *
 */

public class Q18SwapNodes {

    public static void main(String[] args) {
        LinkedList.insertNodeAtFront(7);
        LinkedList.insertNodeAtFront(6);
        LinkedList.insertNodeAtFront(5);
        LinkedList.insertNodeAtFront(4);
        LinkedList.insertNodeAtFront(3);
        LinkedList.insertNodeAtFront(2);
        LinkedList.insertNodeAtFront(1);
        System.out.print(
                "\n Linked list before calling swapNodes() ");
        LinkedList.printList();
        LinkedList.swapNodes(4, 3);
        System.out.print(
                "\n Linked list after calling swapNodes() ");
        LinkedList.printList();
    }

    public static void tempMethod(int[] arr) {
    }
}
