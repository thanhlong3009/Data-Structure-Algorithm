package day_06_Sort;

import java.util.Arrays;

public class LC1913_MaximumProduct {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] * nums[nums.length - 2]) - (nums[0] * nums[1]);
    }
}
