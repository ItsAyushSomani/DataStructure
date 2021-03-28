package LinkedList.DoubleLinkedList;
/**
 *
 */

import LinkedList.SingleLinkedList.LinkedList;

public class DoubleLinkedList {

    public static LinkedList.Node head;

    public static class Node {
        public int data;
        public Node prev;
        public Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node insertNodeAtFront(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        return head;
    }

    public static void insertNodeAfterANode(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node newNode = new Node(new_data);
        newNode.next = prev_node.next;
        prev_node.next = newNode;
        newNode.prev = prev_node;
    }

    public static Node insertNodeAtLast(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
        newNode.next = null;
        return head;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static Node deleteNode(Node head, Node nodeToBeDeleted) {
        if (head == null || nodeToBeDeleted == null) {
            return head;
        }
        if (head == nodeToBeDeleted) {
            head = head.next;
            head.prev = null;
            return head;
        }
        if (nodeToBeDeleted.next != null) {
            nodeToBeDeleted.next.prev = nodeToBeDeleted.prev;
        }
        if (nodeToBeDeleted.prev != null) {
            nodeToBeDeleted.prev.next = nodeToBeDeleted.next;
        }
        return head;
    }

    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node curr = head;
        Node temp = null;
        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        head = temp.prev;
        return head;
    }

}
