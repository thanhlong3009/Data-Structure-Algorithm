package day_04;

public class FibonaciDemo {
    // đếm số lần gọi hàm
    static int count = 0;
    public static void main(String[] args) {
//        System.out.println("result: " + fibonaci(5 ));
        int[] fibos = new int[100];
        // cách 1
//        System.out.println(fibo2(10,fibos));
//        System.out.println("fibo2: " + count);
//        count = 0;
        // cách 2
//        System.out.println(fibonaci(10));
//        System.out.println("fibo1:" + count);

        // cách làm không cần dùng đệ quy
        fibos[1] = fibos[2] = 1;
        for (int i = 3; i <= 10 ; i++) {
            fibos[i] = fibos[i -1] + fibos[i - 2];
        }
        System.out.println(fibos[10]);
    }
    public static int fibonaci(int n){
        count++;
        System.out.println("start n = " + n);
        if (n <= 2){
            System.out.println("end n = " + n);
            return 1;
        }
        int rs = fibonaci(n - 1) + fibonaci(n -2);
        System.out.println("end n = " + n);
        return rs;
    }
    public static  int fibo2(int n, int[] arr){
        count++;
        System.out.println("start n = " + n);
        if (n <= 2){
            System.out.println("end n = " + n);
            return 1;
        }
        if (arr[n] == 0){
            arr[n] = fibo2(n -1,arr) + fibo2(n - 2,arr);
        }
        System.out.println("end n = " + n);
        return arr[n];
        // kĩ thuật memory caching
    }
}
