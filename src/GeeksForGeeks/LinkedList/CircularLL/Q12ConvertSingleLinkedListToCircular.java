package GeeksForGeeks.LinkedList.CircularLL;
/**
 *
 */

import GeeksForGeeks.LinkedList.SingleLinkedList.LinkedList;

public class Q12ConvertSingleLinkedListToCircular {
    public static void main(String[] args) {
        // Start with empty list
        // Using push() function to
        // convert singly linked list
        // 17.22.13.14.15
        LinkedList.insertNodeAtFront(15);
        LinkedList.insertNodeAtFront(14);
        LinkedList.insertNodeAtFront(13);
        LinkedList.insertNodeAtFront(22);
        LinkedList.insertNodeAtFront(17);
        // Call the circular_list function
        // that converst singly linked
        // list to circular linked list.
        LinkedList.Node last = circular(LinkedList.head);
        System.out.print("Display list: \n");
        printList(last);
    }

    private static LinkedList.Node circular(LinkedList.Node head) {
        LinkedList.Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head;
        return curr;
    }

    public static void printList(LinkedList.Node last) {
        LinkedList.Node p = last.next;
        do {
            System.out.println(p.data);
            p = p.next;
        } while (p != last.next);
    }
}
