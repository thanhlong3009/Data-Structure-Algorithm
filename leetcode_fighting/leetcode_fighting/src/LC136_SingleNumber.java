public class LC136_SingleNumber {
    public static void main(String[] args) {

    }

    public int singleNumber(int[] nums) {
//        int rs = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    nums[i] = 0;
//                    nums[j] = 0;
//                }
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                rs = nums[i];
//            }
//        }
//        return rs;
//    }



        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1){
                return nums[i];
            }
        }
        return -1;
    }
}
