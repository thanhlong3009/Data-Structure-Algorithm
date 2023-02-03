public class LC344_ReverseString {
    public static void main(String[] args) {
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h' };
        reverseString(s);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
    public static void reverseString(char[] s) {

        for (int i = 0; i < s.length / 2; i++) {
            char c = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = c;
        }
    }
}
