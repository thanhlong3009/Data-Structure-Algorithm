package day_10_stack_queue;

public class MyLinkedListQueue {

    static class Node{
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    static int size;
    static Node head,tail;
    public static int getSize(){
        return size;
        // return size of queue
    }

    public static int getFirst() {
        if (head == null){
            return -1;
        }
        return head.val;
        // return the first element in queue
    }

    public static int removeFirst(){
        // remove the first element and return value
        // have only 1 element -> head == tail
        // remove head --> head == null
        // tail -> null
        int val = -1;
        if (head == null){
            return -1;
        }
        if (head == tail){ // only 1 element
            val = head.val;
            head = head.next;
            tail = tail.next;
        }else {
            val = head.val;
            head = head.next; // more than 1 element

        }
        size--;
        return val;
    }

    public static void push(int val){
        Node newNode = new Node(val);

        if (head == null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = tail.next;
        }

        size ++;
        // add a new element into queue
    }

    public static void print(Node head) {
        Node current = head;
        while (current != null){
            System.out.print(current.val + " -> ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        push(0);
        push(1);
        push(2);
        push(3);

        print(head);
        System.out.println("remove first : " + removeFirst());
        print(head);
        System.out.println("remove first : " + removeFirst());
        print(head);
        System.out.println("remove first : " + removeFirst());
        print(head);
        System.out.println("remove first : " + removeFirst());
        print(head);
        System.out.println("remove first : " + removeFirst());
        print(head);


    }
}
