package day04;

public class LC50_PowX_N {
    public static void main(String[] args) {
        System.out.println(myPow(0.5, -2));
    }

    public static double myPow(double x, int n) {
        if (n == 0 || x == 1) {
            return 1;
        }
        if (x == -1){
            if (n % 2 == 0) {
                return 1;
            }else {
                return -1;
            }
        }
        if (n < 0) {

            n = -n;
            x = 1/x;
        }
        if ( n == Integer.MIN_VALUE){
            return 0;
        }
        if (n % 2 == 0){
            return myPow(x*x,n/2);
        }
        else {
            return x*myPow(x*x,n/2);
        }
    }

}
