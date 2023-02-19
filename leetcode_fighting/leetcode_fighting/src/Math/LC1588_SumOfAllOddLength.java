package Math;

public class LC1588_SumOfAllOddLength {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));
    }
    // Xét từng số 1 trong dãy từ trái sang phải
    // như ví dụ mảng arr trên
    // xét tổng lần lượt
    // 0 : [0,0] -> [0,2] -> [0,4] Hết
    // 1: 11 -> 13 hết
    // 2: 22 -> 24 Hê
    // 3: 33 -> Hết
    // 4: 44 -> hết
    // 5: 55 -> hết
    // Và cộng tất cả lại
    public static int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum =0;
        for (int i = 0; i <= n; i++) {
            for (int j = i; j < n; j+=2) {
                sum += sumOfInArray(arr,i,j);
            }
        }
        return sum;
    }

    // tính tổng các số từ chỉ mục start đến end trong mảng
    public static int sumOfInArray(int[] arr, int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
