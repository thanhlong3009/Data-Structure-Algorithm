import java.util.ArrayList;

public class LC1389_CreateTargetArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();


        System.out.println(arrayList);

    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arrayList.add(index[i],nums[i]);
        }
        int[] rs = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            rs[i] = arrayList.get(i);
        }
        return rs;
    }
}
