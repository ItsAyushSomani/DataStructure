package LinkedList.SingleLinkedList;
/**
 *
 */

class Q1LinkedList{

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void printList() {
        Node n = Q1LinkedList.head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        Q1LinkedList linkedList = new Q1LinkedList();
        Q1LinkedList.head = new Node(10);
    }

    public static void insert(Node head) {
        Node second = new Node(20);
        Node third = new Node(30);
        Q1LinkedList.head.next = second;
        second.next = third;
    }
}
