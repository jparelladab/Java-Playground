package LinkedList;

public class Node {
    Node next;
    int data;
    Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", data=" + data +
                '}';
    }
}

