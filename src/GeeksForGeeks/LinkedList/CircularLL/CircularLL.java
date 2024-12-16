package GeeksForGeeks.LinkedList.CircularLL;

/**
 *
 */


public class CircularLL {
    static Node last;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node insertNodeInEmpty(Node last, int data) {
        if (last != null) return last;
        last = new Node(data);
        last.next = last;
        return last;
    }

    public static Node insertNodeAtFront(Node last, int new_data) {
        if (last == null) {
            return insertNodeInEmpty(last, new_data);
        }
        Node temp = new Node(new_data);
        temp.next = last.next;
        last.next = temp;
        return last;
    }


    public static Node insertNodeAtLast(Node last, int new_data) {
        if (last == null) {
            return insertNodeInEmpty(last, new_data);
        }
        Node temp = new Node(new_data);
        temp.next = last.next;
        last.next = temp;
        last = temp;
        return last;
    }

    public static void printList(Node last) {
        Node p = last.next;
        do {
            System.out.println(p.data);
            p = p.next;
        } while (p != last.next);
    }

    public static int countNodes(Node last) {
        int count = 0;
        Node p = last.next;
        do {
            count++;
            p = p.next;
        } while (p != last.next);
        return count;
    }

    public static Node delete(Node last, int data) {
        Node curr = last.next;
        while (curr.next != last.next) {
            if (curr.next.data == data) {
                curr.next = curr.next.next;
                break;
            }
            curr = curr.next;
        }
        return last;

    }
}
