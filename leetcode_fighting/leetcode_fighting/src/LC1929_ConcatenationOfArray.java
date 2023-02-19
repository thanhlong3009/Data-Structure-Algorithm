public class LC1929_ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] rs = new int[n * 2];

        for (int i = 0; i < n ; i++) {
            rs[i] = nums[i];
            rs[i + n - 1] = nums[i];
        }
        return rs;
    }
}
