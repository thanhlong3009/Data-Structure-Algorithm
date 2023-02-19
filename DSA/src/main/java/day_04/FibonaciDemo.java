package day_04;

public class FibonaciDemo {
    // đếm số lần gọi hàm
    static int count = 0;
    public static void main(String[] args) {
//        System.out.println("result: " + fibonaci(5 ));

        // cách 1
//        System.out.println(fibo2(10,fibos));
//        System.out.println("fibo2: " + count);
//        count = 0;
        // cách 2
//        System.out.println(fibonaci(10));
//        System.out.println("fibo1:" + count);

        // cách làm không cần dùng đệ quy
        long t1 = System.currentTimeMillis();
        long rs1 = fibo1(47);

        long t2 = System.currentTimeMillis();
        long rs2 = fibo2(47);

        long t3 = System.currentTimeMillis();
        System.out.println(rs1 + " " + (t2 -t1));
        System.out.println(rs2 + " " + (t3 -t2));

    }
    public static int fibo1(int n) {
        if (n <= 1) return n;
        return fibo1(n - 1) + fibo1(n - 2);
    }

    public static int fibo2(int n) {
        int[] F = new int[n + 1];
        F[0] = 0;
        F[1] = 1;
        for (int i = 2; i <= n; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }
        return F[n];
    }
    public static  int fibo3(int n, int[] arr){
        count++;
        System.out.println("start n = " + n);
        if (n <= 2){
            System.out.println("end n = " + n);
            return 1;
        }
        if (arr[n] == 0){
            arr[n] = fibo3(n -1,arr) + fibo3(n - 2,arr);
        }
        System.out.println("end n = " + n);
        return arr[n];
        // kĩ thuật memory caching
    }
}
