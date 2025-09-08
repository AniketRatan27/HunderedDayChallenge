package CodeChallenges;

public class LongestConsecutiveCharacters {
    public int longestConsecutiveChar(String s) {
        char[] str = s.toCharArray();
        int i = 1;
        int currentLen = 1;
        int maxStreak = 1;
        while (i < s.length()) {
            if (str[i] == str[i - 1]) {
                currentLen++;
            } else {
                currentLen = 1;
            }
            maxStreak = Math.max(maxStreak, currentLen);
            i++;
        }
        return maxStreak;
    }
}
