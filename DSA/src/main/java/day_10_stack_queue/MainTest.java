package day_10_stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class MainTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);  // push
        queue.add(2);
        queue.add(3);
        queue.offer(4);

        queue.peek(); // getFirst



        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
