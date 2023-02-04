

public class LC1816_TruncateSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        System.out.println(truncateSentence(s, 4));

    }

    public static String truncateSentence(String s, int k) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
                if (count == k) {
                    return s.substring(0,i);
                }
            }

        }
        return s;

//        String[] arr = s.split(" ");
//        String[] arr2 = new String[k];
//        for (int i = 0; i < k; i++) {
//            arr2[i] = arr[i];
//        }
//        String rs = String.join(" ",arr2);
//        return rs;
    }
}
