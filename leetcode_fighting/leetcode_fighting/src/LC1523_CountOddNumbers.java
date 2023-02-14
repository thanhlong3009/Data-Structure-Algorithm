public class LC1523_CountOddNumbers {
    public int countOdds(int low, int high) {
        // phân tích thống kê từ trường hợp cụ thể ---> tổng quát
        if (low % 2 == 0 && high %2 == 0) {
            return (high -low) / 2;
        }else {
            return (high -low) / 2 + 1;
        }
    }
}
