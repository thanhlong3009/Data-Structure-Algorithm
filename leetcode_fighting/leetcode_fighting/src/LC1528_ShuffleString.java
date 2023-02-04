public class LC1528_ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }
    public static String restoreString(String s, int[] indices) {
        char[] rs = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            rs[indices[i]] = s.charAt(i);
        }
        String rsStr = new String(rs);
        return rsStr;
    }
}
