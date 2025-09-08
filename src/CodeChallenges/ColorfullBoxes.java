package CodeChallenges;

public class ColorfullBoxes {
    public String reverseWord(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] splittedStr = str.split(" ");

        for (int i = 0; i < splittedStr.length; i++) {
            String word = splittedStr[i];
            for (int j = word.length() - 1; j >= 0; j--) {
                stringBuilder.append(word.charAt(j));
            }
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
