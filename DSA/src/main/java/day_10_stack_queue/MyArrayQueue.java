package day_10_stack_queue;

public class MyArrayQueue {

    // FIFO first in first out -> first
    private static final int SIZE = 100;
    static int[] arr;
    static int tail, head;

    public static int getSize(){
        return tail - head;
        // return size of queue
    }

    public static int getFirst() {
        return arr[head];
        // return the first element in queue
    }

    public static int removeFirst(){
        // remove the first element and return value
        int val = arr[head]; // save value
        head++;
        return val;
    }

    public static void push( int val){
        arr[tail] = val;
        tail++;
        // add a new element into queue
    }

    public static void print() {
        for (int i = head; i < tail; i++) {
            System.out.print(arr[i] + "_");
        }
    }

    public static void main(String[] args) {
        arr = new int[SIZE];
        push(0);
        push(1);
        push(2);
        push(3);

        print();
        System.out.println("remove first= " + removeFirst());
        print();
        System.out.println("remove first= " + removeFirst());
        print();
        System.out.println();
        System.out.println("Size = " + getSize());
    }
}
