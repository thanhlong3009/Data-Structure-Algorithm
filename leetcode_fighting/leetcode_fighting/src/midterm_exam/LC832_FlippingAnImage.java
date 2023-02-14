package midterm_exam;

public class LC832_FlippingAnImage {
    // đề bài : cần đổi 0 thành 1 và 1 thành 0; và lật ngược các hàng ( các phần tủ trong 1 hàng)
    // cách làm:
    // tạo ra 1 mảng mới có hàng cột bằng mảng ban đầu
    // duyệt qua từng phần tử : và thêm giá trị sao cho thỏa mãn yêu cầu đề bài

    public static void main(String[] args) {
        int[][] num= {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        int[][] rs = flipAndInvertImage(num);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(rs[i][j]);
            }
            System.out.println();;
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        // tạo mảng mới cần tìm
        int[][] rs = new int[n][n];
        // duyệt qua từng phần tủ của mảng 2 chiều
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                // đảo ngược vị trí các phần tử tham chiếu từ mảng ban đầu qua mảng cần tìm
                // tại mảng image cần đẩu ngược phần tử index [i][j] với [i][n - j - 1]
                // ==> rs[i][j] = image[i][n - j - 1];
                rs[i][j] = image[i][n - j - 1];
                // thay đổi các giá trị 0 thành 1 và 1 thành 0
                if(rs[i][j] == 0){
                    rs[i][j] = 1;
                } else {
                    rs[i][j] = 0;
                }
            }
        }

        return rs;
    }
}
