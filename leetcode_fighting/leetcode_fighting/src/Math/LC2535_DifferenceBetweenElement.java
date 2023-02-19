package Math;

public class LC2535_DifferenceBetweenElement {
    public static void main(String[] args) {

    }
    public static int differenceOfSum(int[] nums) {
        int sum = 0;
        int sumElt = 0;
        for (int i : nums){
            sum += sumOf(i);
            sumElt += i;
        }

        return Math.abs(sum - sumElt);
    }
    public static int sumOf(int n){
        int sum = 0;
        while (n > 0){
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
}
