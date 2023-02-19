import java.util.Arrays;

public class LC283_MoveZeroes {
    public static void main(String[] args) {
        int[] nums= {1,0,5,0,7,6,5};
        System.out.println(Arrays.toString(nums));
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int n = nums.length;  //2
        int idx = 0;           // 1
        for (int i = 0; i < n; i++) { // 3n
            if (nums[i] != 0) {
                nums[idx] = nums[i];
                idx++;
            }
        }
        while (idx < n){   // 2 * (n-idx)
            nums[idx] = 0;
            idx++;
        }
// -> sum = 3n + 2n - 2idx +3 = 5n -2idx + 3 > 3n + 3 <=> 3n ( n >= idx với mọi n)
        // => độ phức tạp O(n)
    }
}
