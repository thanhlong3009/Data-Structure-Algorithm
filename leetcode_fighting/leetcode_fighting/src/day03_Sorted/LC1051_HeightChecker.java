package day03_Sorted;

import java.util.Arrays;

public class LC1051_HeightChecker {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
    public static int heightChecker(int[] heights) {
        int[] rs = Arrays.copyOfRange(heights,0,heights.length);
        Arrays.sort(rs);

        int count = 0;
        for (int i = 0; i < rs.length; i++) {
            if (rs[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}
