import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class LC387_FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
        int[] alphabet = new int['z' - 'a' + 1];
        // Bắt đầu từ a -> index 0, kết thúc tại z -> index 25
        // indexOf b : 'b' - 'a' = 1
        // indexOf c : 'c' - 'a' = 2

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            alphabet[character - 'a']++;  // character - 'a' --> index tương ứng với character đó
        } // Đếm được số lân xuất hiện của tất cả các kí tự trong s;
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (alphabet[character - 'a'] == 1) {
                return i;
            }
        }
        return -1;

        // Cách 2:
//        int alps = Integer.MAX_VALUE;
//        for (char c = 'a'; c <= 'z'; c++) {
//            int index = s.indexOf(c);
//            if (index != -1 && index == s.lastIndexOf(c)) {
//                alps = Math.min(alps, index);
//
//            }
//
//        }
//        return alps == Integer.MAX_VALUE ? -1 : alps;
    }
}
