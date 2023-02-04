public class LC2011_FinalValueOfVariable {
    public static void main(String[] args) {
        String[] operations = {"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for (String s : operations) {
            if (s.charAt(1) == '+') {
                sum ++;
            }else {
                sum --;
            }
        }
        return sum;
    }
}
