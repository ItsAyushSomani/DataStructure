package GeeksForGeeks.LinkedList.SingleLinkedList;
/**
 *
 */

public class LinkedList {

    public static Node head;

    public static void insertNodeAtFront(int i) {

    }

    public static void insertNodeAtLast(int i) {

    }

    public static void insertNodeAfterANode(Node next, int i) {

    }

    public static void deleteNode(int i) {
    }

    public static void deleteNodeAtGivenPosition(int i) {
    }

    public static void deleteList() {
    }

    public static String search(int i) {
        return null;
    }

    public static String searchRecursively(Node head, int i) {
        return null;
    }

    public static LinkedList.Node nodeFromLast(int i) {
        return new Node(5);
    }

    public static Node middleNode() {
        return new Node(5);
    }

    public static boolean countNodesinLoop() {
        return false;
    }

    public static void removeDuplicates() {

    }

    public static void swapNodes(int i, int i1) {
    }

    public static void pairWiseSwap(Node head) {

    }

    public static Node reverse() {
        return null;
    }


    public static class Node {
        public int data;
        public Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void printList() {
        Node n = LinkedList.head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        LinkedList.head = new Node(10);
    }

    public static void insert(Node head) {
        Node second = new Node(20);
        Node third = new Node(30);
        LinkedList.head.next = second;
        second.next = third;
    }
}
