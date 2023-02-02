public class LC27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int rs = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[rs] = nums[i];
                rs++;
            }
        }
        return rs;
    }
}
