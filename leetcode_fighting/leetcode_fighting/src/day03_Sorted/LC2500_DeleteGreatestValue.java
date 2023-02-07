package day03_Sorted;

import java.util.Arrays;

public class LC2500_DeleteGreatestValue {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 4},
                {3, 3, 1}
        };

        System.out.println(deleteGreatestValue(arr));
    }

    public static int deleteGreatestValue(int[][] grid) {
        for (int[] ints : grid) {
            Arrays.sort(ints);
        }
        int max = 0;
        int sum = 0;
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                max = Math.max(max, grid[j][i]);
            }
            sum += max;
            max = 0;
        }
        return sum;
    }
}
