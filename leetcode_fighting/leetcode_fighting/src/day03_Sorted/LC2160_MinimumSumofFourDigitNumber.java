package day03_Sorted;

import java.util.Arrays;

public class LC2160_MinimumSumofFourDigitNumber {
    public static void main(String[] args) {
        int num = 2932;
        System.out.println(minimumSum(num));
    }
    public static int minimumSum(int num) {
        // Cách làm cho trường hợp tổng quát num có bất kỳ số chữ số
        // Sắp xếp lại mảng String từ bé đến lớn
        // 2 số tổng nhỏ nhất cần tìm khi các chữ số đầu tiên của 2 số là bé nhất ( lấy từ vòng lặp dòng 19 - 25 )
//        String numStr = Integer.toString(num);
//        String[] strArr = numStr.split("");
//
//        Arrays.sort(strArr);
//
//        StringBuilder rs1 = new StringBuilder();
//        StringBuilder rs2 = new StringBuilder();
//        for (int i = 0; i < strArr.length; i+=2) {
//            rs1.append(strArr[i]);
//        }
//        for (int i = 1; i < strArr.length; i+=2) {
//            rs2.append(strArr[i]);
//        }
//        return Integer.parseInt(rs1.toString()) + Integer.parseInt(rs2.toString());
        // Trường hợp num chỉ có đúng 4 chữ số
        int[] intArr = new int[4];
        for (int i = 0; i < 4; i++) {
            intArr[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(intArr);
        return (intArr[0] + intArr[1])*10 + intArr[2] + intArr[3];
    }
}
