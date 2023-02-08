package day_04;

public class SumOfArr {
    public static void main(String[] args) {

        int[] arr = {0,1,2,3,4,5,6,7,8};
        System.out.println(sumOfArr(5,arr));
    }

    // tính tổng từ 0 --> n phần tử trong mảng
    private static int sumOfArr(int n, int[] arr) {
        if (n < 0) {
            // sum -> 0
            return 0;
        }

        return arr[n] + sumOfArr(n - 1, arr);
    }

    // duyệt mảng 2 chiều bằng đệ quy
}
