package day_11_hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC1_TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
//        int[] rs = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    rs[0] = i;
//                    rs[1] = j;
//                }
//            }
//        }
//        return rs;

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey((target - nums[i]))){
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i],i);

        }
        return null;
    }
}
