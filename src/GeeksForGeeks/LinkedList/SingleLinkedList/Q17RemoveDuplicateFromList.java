package GeeksForGeeks.LinkedList.SingleLinkedList;
/**
 *
 */

public class Q17RemoveDuplicateFromList {

    public static void main(String[] args) {
        LinkedList.insertNodeAtFront(20);
        LinkedList.insertNodeAtFront(13);
        LinkedList.insertNodeAtFront(13);
        LinkedList.insertNodeAtFront(11);
        LinkedList.insertNodeAtFront(11);
        LinkedList.insertNodeAtFront(11);
        System.out.println("List before removal of duplicates");
        LinkedList.printList();
        LinkedList.removeDuplicates();
        System.out.println("List after removal of elements");
        LinkedList.printList();
    }
}
