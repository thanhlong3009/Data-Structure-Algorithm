import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LC804_UniqueMorseCodeWords {

    public static void main(String[] args) {
        String[] s = {"gin","zen","gig","msg"};
        System.out.println(uniqueMorseRepresentations(s));
    }
    public static int uniqueMorseRepresentations(String[] words) {
        String[] morse ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < words[i].length(); j++) {
                s.append(morse[words[i].charAt(j) - 'a']);
            }
            // giá trị trong hashset là duy nhất

            hashSet.add(s.toString());
        }

        return hashSet.size();
    }

}
