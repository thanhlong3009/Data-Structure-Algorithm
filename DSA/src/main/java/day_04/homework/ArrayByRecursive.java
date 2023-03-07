package day_04.homework;

import java.util.Arrays;

public class ArrayByRecursive {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6}
        };

        recursive2dArray(arr,0,0);
        // 0,0  là bắt đầu duyệt từ vị trí arr[0][0];
    }

    public static void recursive2dArray(int[][] arr, int row, int col) {
        System.out.println(" S : " + row + " , " +col);
        System.out.println(arr[row][col]  + " ");
        if (col < arr[0].length - 1 ) {
            recursive2dArray(arr,row,col + 1) ;
        }else if (row < arr.length -1) {
            recursive2dArray(arr,row + 1,0);
        }
        System.out.println(" E : " + row + " , " +col);


    }
}
