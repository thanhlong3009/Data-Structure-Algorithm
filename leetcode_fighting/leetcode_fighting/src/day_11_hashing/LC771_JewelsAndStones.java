package day_11_hashing;

import java.util.HashSet;
import java.util.Map;

public class LC771_JewelsAndStones {
    public static void main(String[] args) {
        String s1 = "aA";
        String s2 = "aAAbbbb";
        System.out.println(numJewelsInStones(s1,s2));

    }
    public static int numJewelsInStones(String jewels, String stones) {
//        int count = 0;
//        for (int i = 0; i < jewels.length(); i++) {
//            for (int j = 0; j < stones.length(); j++) {
//                if (jewels.charAt(i) == stones.charAt(j)){
//                    count++;
//                }
//            }
//        }
//        return  count;
        char[] chars = jewels.toCharArray();
        HashSet<Character> hashSet = new HashSet<>();
        for (char c : chars){
            hashSet.add(c);
        }

        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (hashSet.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }

}
