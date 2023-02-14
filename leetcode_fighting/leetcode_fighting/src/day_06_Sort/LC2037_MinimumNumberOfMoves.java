package day_06_Sort;

import java.util.Arrays;

public class LC2037_MinimumNumberOfMoves {
    public static void main(String[] args) {

    }
    public int minMovesToSeat(int[] seats, int[] students) {
        // sắp xếp 2 mảng theo thứ tự tăng dần

        Arrays.sort(seats);
        Arrays.sort(students);
        int n = seats.length;

        // Cộng tổng số lần di chuyển và đưa ra kết quả
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += Math.abs(seats[i] - students[i]);
        }
        return count;
    }
}
