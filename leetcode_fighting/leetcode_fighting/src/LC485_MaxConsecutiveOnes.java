

public class LC485_MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] rs = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(rs));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count = 0;
            } else {
                count ++;
                if (max < count) {
                    max = count;
                }
            }
        }

        return max;
    }
}
