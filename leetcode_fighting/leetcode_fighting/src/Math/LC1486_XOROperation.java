package Math;

public class LC1486_XOROperation {
    public static void main(String[] args) {
        System.out.println(xorOperation(4,3));
    }
    // XOR operation của a và b =  a ^ b => với 1 mảng ta chỉ cần dùng vòng lặp rs ^= a[i]
    public static int xorOperation(int n, int start) {
        int rs = 0;
        for (int i = 0;i < n;i ++){
            rs ^= start + 2 *i;
        }
        return rs;
    }
}
