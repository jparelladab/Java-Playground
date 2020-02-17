package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    Node head;

    @Override
    public String toString() {
        if (this.head == null) {
            return "{}";
        }
        Node current = head;
        List<Integer> linkedListArrayList = new ArrayList<>();
        while (current != null) {
            linkedListArrayList.add(current.data);
            current = current.next;
        }
        return linkedListArrayList.toString();
    }

    void append(int data) {
        if (head == null) {
            this.head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    void prepend(int data){
        if (head == null) {
            this.head = new Node(data);
            return;
        }
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    void deleteWithValue(int data){
        if (head == null) { return; }
        else if (head.data == data){
            head.next = this.head;
        }
        else {
            Node current = head;
            while (current.next != null) {
                if (current.next.data == data) {
                    current.next = current.next.next;
                    return;
                } else { current = current.next; }
            }
        }
    }

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.prepend(0);
        myLinkedList.deleteWithValue(3);
        System.out.println(myLinkedList);
    }
}

