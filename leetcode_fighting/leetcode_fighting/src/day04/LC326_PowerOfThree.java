package day04;

public class LC326_PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }else if( n > 1 && n % 3 == 0) {
            return isPowerOfThree(n / 3);
        }
        return false;
    }
}
