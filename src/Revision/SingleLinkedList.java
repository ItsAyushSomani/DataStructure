package Revision;

/**
 *
 */

class Node {
 int value;
 Node next;
 public Node head = null;
 Node(int value) {
     this.value = value;
     next = null;
 }

 public void addElementAtLast(int value) {
     if(head == null) {
         head = new Node(value);
     }
     Node temp = head;
     while(temp.next != null) {
         temp = temp.next;
     }
     temp.next = new Node(value);
 }
// 5 10 15 20
 public Node deleteElement(int value) {
        if(head.value == value) {
            head = head.next;
            return head;
        }
        Node prev = head;
        Node next = head.next;
        while(next != null) {
            if(next.value == value) {
                prev.next = next.next;
            }
            prev = prev.next;
            next = next.next;
        }
        return head;
 }
// 10 20 30 40
    public Node updateElement(int prevValue, int newValue) {
        Node temp = head;
        while(temp != null) {
            if(temp.value == prevValue) {
                Node newNode = new Node(newValue);
                newNode.next = temp.next;
                temp.next = newNode;
                return head;
            }
            temp =temp.next;
        }
        return head;
    }

}
public class SingleLinkedList {

    public static void main(String[] args) {
//        Node
    }
}
