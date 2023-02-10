package day05_BinarySearch;

public class LC69_Sqrt {
    public int mySqrt(int x) {
        if (x == 0 || x == 1){
            return x;
        }
        int left = 0, right = x;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (x / mid == mid) {
                return mid;
            }
            if (x / mid > mid) {
                left = mid + 1; // mid vẫn còn chưa đủ lớn -> cần check ở range lớn hơn
            }else {
                right = mid - 1; // Mid đã quá lớn rồi -> cần check ở range nhỏ hơn
            }
        }
        return right;
    }
}
