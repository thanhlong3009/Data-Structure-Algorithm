package day04;

public class LC342_PowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(17));
    }

    public static boolean isPowerOfFour(int n) {
        if (n == 1) {
            return true;
        }else if( n > 1 && n % 4 == 0) {
            return isPowerOfFour(n / 4);
        }
        return false;
    }
}