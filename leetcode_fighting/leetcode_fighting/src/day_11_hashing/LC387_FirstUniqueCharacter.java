package day_11_hashing;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LC387_FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
//        int[] alphabet = new int['z' - 'a' + 1];
//        // Bắt đầu từ a -> index 0, kết thúc tại z -> index 25
//        // indexOf b : 'b' - 'a' = 1
//        // indexOf c : 'c' - 'a' = 2
//
//        for (int i = 0; i < s.length(); i++) {
//            char character = s.charAt(i);
//            alphabet[character - 'a']++;  // character - 'a' --> index tương ứng với character đó
//        } // Đếm được số lân xuất hiện của tất cả các kí tự trong s;
//        for (int i = 0; i < s.length(); i++) {
//            char character = s.charAt(i);
//            if (alphabet[character - 'a'] == 1) {
//                return i;
//            }
//        }
//        return -1;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))){
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i)) + 1 );
            }else {
                hashMap.put(s.charAt(i),1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.get(s.charAt(i)) == 1 ){
                return i;
            }
        }
        return -1;


    }
}
