package day_06_Sort;

import java.util.Arrays;

public class LC905_SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {1,2,0,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
    public static int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] rs = new int[nums.length];
        for (int i: nums){
            if (i % 2 == 0){
                rs[right] = i;
                right--;
            }else {
                rs[left] = i;
                left++;
            }
        }
        return rs;
    }


}
