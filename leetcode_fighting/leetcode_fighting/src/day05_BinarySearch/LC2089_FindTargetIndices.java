package day05_BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC2089_FindTargetIndices {
    public static void main(String[] args) {
        int[] nums = {0,4,5,6,1,3,5,6,1};
        for (Integer i : targetIndices(nums, 1)) {
            System.out.println(i);
        }
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }
        return list;
    }
}