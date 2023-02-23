public class LC70_ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(11));


    }
    // dựa vào liệt kê từ 1 đến 6 ta thấy
    // n = 1 -> 1
    // n = 2 -> 2
    // n = 3 -> 3
    // n = 4 -> 5
    // n = 5 -> 8
    // n = 6 -> 13
    // ==> công thức chung Xn = X(n - 1) + X(n -2)
    public static int climbStairs(int n) {
        if(n <=2){
            return n;
        }
        int[] rs = new int[n];
        rs[0] = 1;
        rs[1] = 2;
        for (int i = 2; i < n; i++) {
            rs[i] = rs[i -1] + rs[i -2];
        }
        return rs[n -1];
    }

}
