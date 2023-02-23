import java.util.Arrays;

public class LC_LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        String[] str =s.split("\\s");
        System.out.println(Arrays.toString(str));
    }
    public int lengthOfLastWord(String s) {
        String[] arrStr = s.split(" ");
        return arrStr[arrStr.length - 1].length();
    }
}
