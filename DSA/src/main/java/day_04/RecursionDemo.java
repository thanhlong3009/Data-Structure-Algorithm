package day_04;

public class RecursionDemo {

    public static void main(String[] args) {
//        print(0);

//        doSomething();

        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(4));
    }

    private static void doSomething() {
        int mySum = sum(1, 2);
        System.out.println(mySum);
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static void print(int n) {
        // Vòng đời của đệ quy: thằng cha chỉ được end khi thằng con end( vd n = 4 là cha n = 3)
        // điêu kiện dừng
        if (n > 5) {
            return;
        }

        // công th truy hồi - công thức quy nạp
        System.out.println("Start: n = " + n);
        print(n + 1);
        System.out.println("End: n = " + n);
    }

    private static int factorial(int n) {
        // Điều kiện cơ sở ( điểm neo)
        System.out.println("Start n = " + n);
        if (n == 0) {
            return 1;
        }
        // Công thức quy nạp (công thức tổng quát)
        int rs =  n * factorial(n - 1);
        System.out.println("End n = " + n);
        return rs;
        // 0! = 1 // điêu kiện cơ sở
        // 1! = 1 * 0!
        // 2! = 2 * 1!
        // 3! = 3 * 2!
    }

}
