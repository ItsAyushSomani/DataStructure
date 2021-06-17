package GeeksForGeeks.LinkedList.SingleLinkedList;

/**
 *
 */

public class Q11MiddleOfList {

    public static void main(String[] args) {
        for (int i = 5; i > 0; --i) {
            LinkedList.insertNodeAtFront(i);
            LinkedList.printList();
            System.out.println("middle of the list is" + LinkedList.middleNode().data);
        }

    }
}
