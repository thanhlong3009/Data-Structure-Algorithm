public class LC771_JewelsAndStones {
    public static void main(String[] args) {
        String s1 = "aA";
        String s2 = "aAAbbbb";
        System.out.println(numJewelsInStones(s1,s2));
        System.out.println('a'=='A');
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)){
                    count++;
                }
            }
        }
        return  count;
    }
}
