import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LC989_AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = {1,9,8,7};
        System.out.println(addToArrayForm(num,1));


    }
// Cách 1 : Dài

    // Đưa k về mảng int
    // sau đó cộng từng phần tử từ cuối lên của 2 mảng
//    public static List<Integer> addToArrayForm(int[] num, int k) {
//        String temp = Integer.toString(k);
//        int[] tempInt = new int[temp.length()];
//        for (int i = 0; i < tempInt.length; i++) {
//            tempInt[i] = Character.getNumericValue(temp.charAt(i));
//        }
//        List<Integer> rs = new ArrayList<>();
//        int n = num.length - 1;
//        int m = tempInt.length - 1;
//        int surplus =0;
//        while(n >= 0 && m >=0){
//            int a = num[n] + tempInt[m] + surplus;
//            surplus = 0;
//            if (a > 9){
//                a %= 10;
//                surplus = 1;
//            }
//            rs.add(0,a);
//            n--;
//            m--;
//        }
//        if (n >= m ){
//            while (n >=0){
//                int a = num[n] + surplus;
//                surplus = 0;
//                if (a > 9){
//                    a %= 10;
//                    surplus = 1;
//                }
//                rs.add(0,a);
//                n--;
//            }
//        }else {
//            while (m >=0){
//                int a = tempInt[m] + surplus;
//                surplus = 0;
//                if (a > 9){
//                    a %= 10;
//                    surplus = 1;
//                }
//                rs.add(0,a);
//                m--;
//            }
//        }
//        if (surplus == 1){
//            rs.add(0,1);
//        }
//        return rs;
//    }


    public static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> rs = new ArrayList<>();
        // thêm các phần tử vào rs
        for (int i = num.length - 1; i >= 0 ; i--) {
            rs.add((num[i] + k)%10);
            k = (num[i] + k) / 10;
        }
        // nếu k dài hơn num, thêm k vào rs
        while (k >0){
            rs.add(k%10);
            k /= 10;
        }
        // đảo ngược rs
        Collections.reverse(rs);
        return rs;
    }
}
