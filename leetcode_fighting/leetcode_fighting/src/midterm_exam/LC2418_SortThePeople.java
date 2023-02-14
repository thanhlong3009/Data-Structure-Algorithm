package midterm_exam;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC2418_SortThePeople {
    // Phân tích đề bài: Cho mảng tên và mảng chiều cao tươngứng với tên, sắp xếp tên theo thứ tự chiều cao giảm dần
    // Cách làm: Sử dụng hashmap để lưu trữ name và height tương ứng
    // Sort mảng chiều cao
    // Lưu lại name  sắp xếp giảm dần vào mảng mới rs theo height từ hashmap
    public static void main(String[] args) {
        int[] nums = {1,0,4,3};
        String[] names = {"Long","Huơng","Chi","Linh"};

        System.out.println(Arrays.toString(sortPeople(names,nums)));
    }
    public static String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        // Khởi tạo và thêm các phần tử vào hashmap
        Map<Integer,String> people = new HashMap<Integer,String>();
        for (int i = 0; i < n; i++) {
            people.put(heights[i],names[i]);
        }
        // sắp xếp heights theo thứ tự tăng dần
        Arrays.sort(heights);
        String[] rs = new String[n];
        int j = 0;
        // thêm phần tử vào rs theo thứ tự giảm dần bằng cách lấy từ cuối mảng heights lên
        for (int i = n -1; i >= 0 ; i--) {
            rs[j] = people.get(heights[i]);
            j++;
        }
        return rs;
    }

}
