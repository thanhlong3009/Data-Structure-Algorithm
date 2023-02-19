public class LC1832_CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsover"));
    }
    public static boolean checkIfPangram(String sentence) {
        for (int i = 'a'; i < 'z'; i++) {
            if (sentence.indexOf(i) == -1){
                return false;
            }
        }
        return true;
    }
}
