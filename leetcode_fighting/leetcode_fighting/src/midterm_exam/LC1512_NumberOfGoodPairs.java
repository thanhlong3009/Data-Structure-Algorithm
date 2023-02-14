package midterm_exam;

public class LC1512_NumberOfGoodPairs {
    // Phân tích đề bài: Tìm ra các cặp giống nhau trong mảng số nguyên không trùng lặp lại (i < j)
    // Cách làm: sử dụng 2 vòng lăp for để kiểm tra các phần tử trong mảng
    // Nếu có 2 phần tử bằng nhau sẽ tăng count len 1 đơn vị, return count
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1 ; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
