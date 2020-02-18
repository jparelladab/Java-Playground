package LinkedList;

public class LoopInspector {
    public int loopSize(Node node) {
        Node slow = node;
        Node fast = node.next;
        while (true){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                Node mark = slow;
                slow = slow.next;
                int counter = 2;
                while (mark != slow){
                    slow = slow.next;
                    counter += 1;
                }
                return counter;
            }
        }
    }

}
