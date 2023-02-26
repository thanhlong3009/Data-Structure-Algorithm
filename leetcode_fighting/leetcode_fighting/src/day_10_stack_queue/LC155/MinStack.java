package day_10_stack_queue.LC155;

public class MinStack {

    static class Node {
        int val;
        int min;
        Node next;

        Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

    static Node head ;

    public MinStack() {
        head = null;
    }

    public static void push(int val) {
        if (head == null) {
            head = new Node(val, val);
        } else {
            Node newNode = new Node(val, Math.min(val, head.min));
            newNode.next = head;
            head = newNode;
        }
    }

    public static void pop() {
        if (head != null) {
            head = head.next;
        }

    }

    public static int top() {
        if (head == null) {
            return -1;
        }
        return head.val;
    }

    public static int getMin() {
        if (head == null) {
            return -1;
        }
        return head.min;
    }


    //"MinStack","push","top","getMin
    public static void main(String[] args) {
        push(-1);
        System.out.println(top());
        System.out.println(getMin());


    }
}
