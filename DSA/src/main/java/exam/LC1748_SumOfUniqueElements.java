package exam;

import java.util.HashMap;

public class LC1748_SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        // tạo hashmap để lưu phần tử trong mảng(key) và số lần xuất hiện(value)
        // tính tổng các phần tủ chỉ xuất hiện 1 lần

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int sum = 0;
        // thêm các phần tủ và số lần xuất hiện vào hashmap
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])){
                // các phần tử trùng key đợcc ghi đè
                hashMap.put(nums[i],hashMap.get(nums[i]) + 1);
            }else {
                hashMap.put(nums[i],1);
            }
        }
        // tính tổng các phần tử value bằng 1
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.get(nums[i]) == 1){
                sum += nums[i];
            }
        }
        return sum;
    }
    // Đỗ phức tạp O(n)
}
