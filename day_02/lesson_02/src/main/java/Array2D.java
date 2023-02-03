public class Array2D {
    public static void main(String[] args) {
        int[][] array2D = {
                {1, 2, 2},
                {4, 5, 6}
        };
        // args.length: trả về số hàng của ma trận
        for (int i = 0; i < array2D.length; i++) {
            // array2D[0] : trả về 1 mảng 1 chiều
            // array2D[0].length : trả về số dòng của mảng 2 chiều
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " "); // array[row][col]
            }
            System.out.println();
        }

        int count = 0;
        int[][] arr2 = new int[2][4];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = 1 + count;
                count++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
