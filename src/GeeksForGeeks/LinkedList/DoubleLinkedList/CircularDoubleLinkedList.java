package GeeksForGeeks.LinkedList.DoubleLinkedList;

/**
 *
 */

public class CircularDoubleLinkedList {

    public static Node deleteNode(Node head, int i) {
        if (head == null)
            return head;
        if(head.data == i) {

        }
        Node curr = head;
        while (curr.next != head) {
            if (curr.data == i) {
                Node prev = curr.prev;
                prev.next = curr.next;
                curr.next.prev = prev;
            }
        }
        return head;
    }

    public static class Node {
        public int data;
        public Node prev;
        public Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node insertNodeAtLast(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.prev = head;
            head.next = head;
            return head;
        }
        Node last = head.prev;
        newNode.next = head;
        newNode.prev = last;
        last.next = newNode;
        head.prev = newNode;
        return head;
    }

    public static Node insertNodeAtFront(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.prev = head;
            head.next = head;
            return head;
        }
        newNode.next = head;
        newNode.prev = head.prev;
        head.prev = newNode;
        head = newNode;
        return head;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr.next != head) {
            System.out.println(curr.data);
            curr = curr.next;
        }
        System.out.println(curr.data);
    }


}
