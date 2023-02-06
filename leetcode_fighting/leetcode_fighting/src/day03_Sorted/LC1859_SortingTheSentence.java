package day03_Sorted;

import java.util.Arrays;

public class LC1859_SortingTheSentence {
    public static void main(String[] args) {
        String s ="is2 sentence4 This1 a3 ";
        System.out.println(sortSentence(s));
    }
    public static String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] rs = new String[str.length];
        for (int i = 0; i < rs.length; i++) {
            rs[Character.getNumericValue(str[i].charAt(str[i].length() - 1) - 1)] = str[i].substring(0,str[i].length() - 1);

        }
        return String.join(" ",rs);
    }
}
