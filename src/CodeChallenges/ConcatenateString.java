package CodeChallenges;

import java.util.List;

public class ConcatenateString {
    public boolean user_logic(List<String> word1, List<String> word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for (int i = 0; i < word1.size(); i++) {
            if (!word1.get(i).equals(" ")) {
                str1.append(word1.get(i));
            }
        }
        for (int i = 0; i < word2.size(); i++) {
            if (!word2.get(i).equals(" ")) {
                str2.append(word2.get(i));
            }
        }
        if (str1.equals(str2)) {
            return true;
        }
        return false;
    }
}
