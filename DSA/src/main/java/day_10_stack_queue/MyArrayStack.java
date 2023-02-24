package day_10_stack_queue;

public class MyArrayStack {
    public static int[] arr;
    public static int top = -1;
    public static void push (int val) {
        arr[++top] = val;
    }

    // lấy ra ngoài và trả về giá trị đã lấy của thằng trên đỉnh
    public static int pop() {
        if (top == -1) {
            return -1;
        }
        int val = arr[top];
        top--;
        return val;
    }

    public static int peel(){
        return arr[top];
    }

    public static int size() {
        return top + 1;
    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        arr = new int[100];
        push(1);
        push(2);
        push(3);

        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
    }
}
