package day_10_stack_queue.LC933;

public class RecentCounter {

    static class Node{
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    static int size;
    static Node head,tail;

    public RecentCounter() {
        head = null;
        tail = null;
        size = 0;
    }

    public static int getSize(){
        return size;
    }

    public static int getFirst() {
        if (head == null){
            return -1;
        }
        return head.val;
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
    }
    public static void removeFirst(){
        if (head == null){
            return;
        }
        if (head == tail){
            head = head.next;
            tail = tail.next;
        }else {
            head = head.next;
        }
        size--;
    }
    public static int ping(int t) {
        push(t);
        while ( t - 3000 > getFirst() ){
            removeFirst();
        }

        return getSize();
    }
}
