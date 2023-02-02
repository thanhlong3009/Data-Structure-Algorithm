import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 4;
        arr[1] = 2;
        arr[2] = 6;

        // Chèn số 3 vào index bằng 1


        // Dịch tất cả phần tử từ index băng 1 sang phải

        // set arr[1] = 3;

        for (int i = arr.length - 1; i > 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[1] = 3;
        for (int i : arr) {
            System.out.println(i);
        }

        List<Integer> list = new ArrayList<>();
        list.add(1,1000);



    }
}

