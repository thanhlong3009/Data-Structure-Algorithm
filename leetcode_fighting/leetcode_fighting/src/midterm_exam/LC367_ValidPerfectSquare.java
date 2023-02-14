package midterm_exam;

public class LC367_ValidPerfectSquare {
    // đề bài: kiểm tra xem 1 số có phải là số chính phương không
    // =>> Kiểm tra xem có tồn tại 1 số n sao cho n * n = num không

    // cách làm: sử dụng phương pháp binary search để tìm ra kết quả
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));
    }
    public static boolean isPerfectSquare(int num) {
        // trường hợp num = 1 sẽ return luôn
        if (num == 1){
            return true;
        }
        // Khi n khác 1 ta sẽ xét từ 2 đến num / 2 do số đầu tiên sau 1 là số chính phương là 4 = 2 * 2 => giá trị mid cần tìm sẽ luôn nhỏ hơn hoặc bằng 1/2 lần số num => đặt right = num/2
        int left = 2;
        int right = num/2;
        while (left <= right){
            long mid = left + (right - left)/2;

            if (mid * mid == num){
                return true;
            }
            if (mid * mid < num){ // mid cần tìm nằm ở nửa trên
                left = (int) (mid + 1);
            }else {  // mid cần tìm nằm ở nửa dưới
                right = (int) (mid - 1);
            }
        }
        return false;
    }
}
