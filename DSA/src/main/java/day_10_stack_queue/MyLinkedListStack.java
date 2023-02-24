package day_10_stack_queue;

import java.util.Stack;

public class MyLinkedListStack {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    static Node head;
    static int size;

    public static void push(int val){
        // add at head
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public static int pop() {
        if (head == null) {
            return -1;
        }
        int val = head.val;
        // remove head
        head = head.next;
        size--;
        return val;

    }

    public static int peek(){
        if (head==null){
            return -1;
        }
        return head.val;
    }

    public static boolean isEmpty(){
        return head == null;
    }

    public static void main(String[] args) {
//        push(0);
//        push(1);
//        push(2);
//
//        System.out.println(pop());
//        System.out.println(pop());
//        System.out.println(pop());

        Stack<Integer> stack =new Stack<>();
        stack.push(0);
        stack.push(1);
        stack.push(2);

        System.out.println(stack.peek());

        stack.pop();

        stack.isEmpty();

    }
}
