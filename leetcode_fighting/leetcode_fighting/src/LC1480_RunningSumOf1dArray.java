public class LC1480_RunningSumOf1dArray {
    public static void main(String[] args) {

    }
    // Mỗi phần tủ đằng sau mảng cần tìm sẽ bằng phần tử đằng trước cộng chính nó tại mảng index
    public static int[] runningSum(int[] nums) {
       int n = nums.length;
        if (n == 1) {
            return nums;
        }
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i -1];
        }
        return nums;
    }
}
