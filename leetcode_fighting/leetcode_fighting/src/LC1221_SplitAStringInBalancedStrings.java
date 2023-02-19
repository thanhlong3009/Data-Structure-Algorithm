public class LC1221_SplitAStringInBalancedStrings {
    // s = "RLRRLLRLRL"
    public static void main(String[] args) {

    }

    // count  để đém, khi count về bằng 0 -> L = R
    public int balancedStringSplit(String s) {
        int count = 0;
        int rs = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L'){
                count += 1;
            }else {
                count += -1;
            }
            if (count == 0){
                rs ++;
            }
        }
        return rs;
    }
}
