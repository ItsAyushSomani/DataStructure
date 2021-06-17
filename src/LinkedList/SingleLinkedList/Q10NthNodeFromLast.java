package LinkedList.SingleLinkedList;
/**
 *
 */

public class Q10NthNodeFromLast {

    public static void main(String[] args) {
        LinkedList.insertNodeAtFront(20);
        LinkedList.insertNodeAtFront(4);
        LinkedList.insertNodeAtFront(15);
        LinkedList.insertNodeAtFront(35);
        System.out.println(LinkedList.nodeFromLast(4).data);
    }
}
