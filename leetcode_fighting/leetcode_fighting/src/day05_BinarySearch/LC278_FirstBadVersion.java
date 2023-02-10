package day05_BinarySearch;

public class LC278_FirstBadVersion {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }


    // Em chỉ gọi method để đó để đỡ báo lỗi
    private boolean isBadVersion(int mid) {
        return true;
    }
}
