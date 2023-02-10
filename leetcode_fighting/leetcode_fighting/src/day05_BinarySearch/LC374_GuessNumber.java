package day05_BinarySearch;

public class LC374_GuessNumber {
    public int guessNumber(int n) {
        if (n == 1) {
            return 1;
        }
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (guess(mid) == 0) {
                return mid;
            }
            if (guess(mid) == -1) {
                right = mid - 1;
            }
            if (guess(mid) == 1) {
                left = mid + 1;
            }
        }
        return -1;
    }

    // Em chỉ gọi method để đó để đỡ báo lỗi
    public static int guess(int num){
        return 0;
    }
}
