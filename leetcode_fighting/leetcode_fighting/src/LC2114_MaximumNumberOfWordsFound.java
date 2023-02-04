public class LC2114_MaximumNumberOfWordsFound {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s : sentences) {
             int spaceCount = countNumberOfSpaces(s);
             max = Math.max(max,spaceCount + 1);
        }
        return max;
    }

    public static int countNumberOfSpaces(String str) {
         int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}
