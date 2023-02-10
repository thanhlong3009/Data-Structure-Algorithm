package day05_BinarySearch;

public class LC704_BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        while (left <= right){ // left = right -> mảng con chỉ chứa duy nhất 1 phần tử
            int mid = (left+ right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target){
                // range: mid + 1 -> right

                left = mid + 1;
            }else {
                // range: left -> mid -1
                right = mid -1;
            }
        }
        // left > right
        // -> số lần duyệt tối đa sẽ là log2(n) ví dụ 5 = log2(32) -> 5 lần
        return -1;
    }
}
