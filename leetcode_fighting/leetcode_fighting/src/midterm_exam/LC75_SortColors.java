package midterm_exam;

public class LC75_SortColors {
    // đề bài : sắp xếp mảng theo thứ tự tăng dần và mảng chỉ gồm 0,1,2

    // sử dụng 2 vòng lặp for
    // sau mỗi vòng for nhỏ sẽ dồn được 1 số lớn về cuối mảng
    // => vòng lặp to sẽ đếm số lần duyệt => số lần lặp = số phần tử của mảng.
    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // sau mỗi vòng j sẽ chắc chắn sắp xếp được 1 số cuối mảng
            // => sau mỗi vòng j số giá trị j cần xét sẽ giảm đi 1
            for (int j = 0; j < nums.length - 1 - i; j++) {
                // so sánh số tại index đang xét vói index ngay sau nó, nếu lớn hơn sẽ đổi chỗ
                if (nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
