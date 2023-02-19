package day03_Sorted;

import java.util.Arrays;

public class LC1464_MaximumProductOfTwoElements {
    // sắp xếp lại mảng, 2 số cần tìm dể tích lớn nhất là 2 só cuối maảng
    public int maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return (nums[n - 1] - 1)*(nums[n -2] - 1);
    }
}
