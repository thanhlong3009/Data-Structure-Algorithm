import java.util.Arrays;

public class LC1470_ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums, 3)));

    }
    public static int[] shuffle(int[] nums, int n) {
        int[] rs = new int[nums.length];

        for (int i = 0; i < n ; i++) {
            rs[i*2] = nums[i];
            rs[i * 2 + 1] = nums[n + i];
        }
        return rs;
    }

}
