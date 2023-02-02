import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class LC485_MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] rs = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(rs));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
//        int count = 0;
//        int id = 0;
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                count++;
//            }
//            else {
//                list.add(id,count);
//                id++;
//                count = 0;
//            }
//        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        int max = 0;
//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i).compareTo(max) > 0) {
//                max = list.get(i);
//            }
//        }
//        return max;
        int count = 0;
        for (int i : nums) {
            if (i == 0 ) {
                count ++;
            }
        }
        int index = 0;
        int subCount = 0;
        int[] rs = new int[count + 1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                subCount++;
            }
            else {
                rs[index] = subCount;
                index++;
                subCount = 0;
            }
        }
        for (int i : rs) {
            System.out.println(i);
        }
        int max = 0;
        for (int i : rs) {
            if (max < i) {
                max =i;
            }
        }
        return max;

    }
}
