package day05_BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ERROR_LC2089_FindTargetIndices {
    public static void main(String[] args) {
        int[] nums = {81,7,87,77,45,70,4,20,41,8,74,88,71,28,74,41,12,16,99,13,69,34,57,74,76,88,15,1,64,10,28,89,25,12,7,69,81,39,58,79,28,27,7,87,1,66,50,93,30,76,34,22,20,89,35,42,90,22,54,50,10,20,24,44,87};
        for (Integer i : targetIndices(nums, 1)) {
            System.out.println(i);
        }
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                list.add(mid);
                // TODO: chưa nghĩ ra cách để duyệt các số bằng số đã cho trong trượng hợp mảng có nhiều số 5
                int midLeft = mid - 1;
                while (midLeft > 0 && nums[midLeft] == target){
                    list.add(midLeft);
                    midLeft--;
                }
                int midRight = mid + 1;
                while (midRight < nums.length  && nums[midRight] == target){
                    list.add(midRight);
                    midRight++;
                }

                break;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        Collections.sort(list);
        return list;
    }
}