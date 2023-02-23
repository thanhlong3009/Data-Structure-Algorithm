import java.util.Arrays;

public class LC68_PlusOne {
    public static void main(String[] args) {
        int[] arr = {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    public static int[] plusOne(int[] digits) {
        // lọc  từ cuối lên, nếu số cuối < 9 thì chỉ cần cộng thêm 1 là return
        // Nếu digits[i] = 9 --> trả về + 1 = 0 và chuyển qua số tiếp theo bên trái
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;            }
            digits[i] = 0;
        }

        // Nếu vòng for trên dến số cuối cùng vẫn bằng 0 -> mảng toàn số 9 -> return mảng mới sẽ dài hơn 1 phần tử và số đầu là 1, tất cả sau là 0;
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}