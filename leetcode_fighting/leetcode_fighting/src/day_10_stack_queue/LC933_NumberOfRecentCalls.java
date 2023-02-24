package day_10_stack_queue;

public class LC933_NumberOfRecentCalls {
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

    public int ping(int t) {
        while (!queue.isEmpty() && t - queue.peek() > 3000) {
            queue.poll();
        }
        while (getFirst() != 0 && t - getFirst() > 3000){

        }

        queue.add(t);
        return queue.size();
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



}
