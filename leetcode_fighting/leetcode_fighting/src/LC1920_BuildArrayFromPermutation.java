public class LC1920_BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] rs = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            rs[i] = nums[nums[i]];
        }
        return rs;
    }
}
