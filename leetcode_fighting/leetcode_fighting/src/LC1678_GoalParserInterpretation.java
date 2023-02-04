public class LC1678_GoalParserInterpretation {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        // output :  Gooooal


    }
    public String interpret(String command) {
        StringBuilder rs = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G'){
                rs.append("G");
            } else if (command.charAt(i) == '(') {
                if (command.charAt(i+1) == ')') {
                    rs.append("o");
                }else {
                    rs.append("al");
                }
            }
        }
        return rs.toString();
    }
}
