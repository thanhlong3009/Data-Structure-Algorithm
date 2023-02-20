package day_07;

public class LC766_ToeplitzMatrix {
    public static void main(String[] args) {

    }
    public static boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i <matrix.length - 1; i++) {  // 4(m -1)
            for (int j = 0; j < matrix[i].length - 1; j++) {  //4
                if (matrix[i][j] != matrix[i+1][j+1]) { // 1
                    return false;  // 1
                }
                // => 6 * (n -1)
            }
        }
        return true;  // 1
        // => sum = 4(m-1)6(n-1) + 1 <=> m * n =>> O(n^2)
    }
}
