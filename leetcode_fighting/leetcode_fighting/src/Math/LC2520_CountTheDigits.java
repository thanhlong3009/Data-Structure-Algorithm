package Math;

public class LC2520_CountTheDigits {
    public static void main(String[] args) {

        System.out.println(countDigits(1200));
    }
    public static int countDigits(int num) {
        // biến đếm
        int count = 0;
        // mỗi vòng lặp idx sẽ lấy ra 1 chữ số, từ hàng đơn vị đổ lên
        int idx = num;
        while (idx > 0){
            int value = idx %10;
            if (value !=0 && num % value == 0){
                count++;
            }
            idx /=10;
        }
        return count;
    }
}
