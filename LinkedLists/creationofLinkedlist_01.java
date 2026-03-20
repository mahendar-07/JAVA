import java.util.*;

class creationoflinkedlist_01 {

    class Node {
        int val;
        Node next;

        Node(int data) {
            this.val = data;
            this.next = null;
        }
    }

    Node head;

    // Add element at end
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    // Print list
    public void printlist() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String args[]) {
        creationoflinkedlist_01 list = new creationoflinkedlist_01();

        list.add(10);
        list.add(20);
        list.add(30);

        list.printlist();
    }
}