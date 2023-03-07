package exam;

import java.util.Arrays;

public class LC733_FloodFill {
    // đổi màu cho điểm đầu, sau đó sử dụng đệ quy để đổi màu 4 huớng xung quanh cho đến khi hết dài rộng của ma trận hoặc gặp các điểm khác màu điểm đầu
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] != color) {
            replace(image, sr, sc, image[sr][sc], color);
        }
        return image;
    }

    public static void replace(int[][] image, int sr, int sc, int oldColor, int color) {
        // kiểm tra điểm đang xét có thỏa mãn điều kiện để đổi màu không, nếu không return
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) {
            return;
        }

        if (image[sr][sc] == oldColor) {
            image[sr][sc] = color; // đổi màu nếu điểm đó cùng màu với điểm đầu
            // để quy để xét 4 điểm xung quanh điểm đang xét
            replace(image, sr+1, sc, oldColor, color);
            replace(image, sr-1, sc, oldColor, color);
            replace(image, sr, sc+1, oldColor, color);
            replace(image, sr, sc-1, oldColor, color);
        }
        //=> O(n)
    }
    public static void main(String[] args) {
        int[][] image = {
                {1,1,1},
                {1,1,0},
                {1,0,1},
        };
        System.out.println(Arrays.deepToString(floodFill(image, 1, 1, 2)));
    }
}
