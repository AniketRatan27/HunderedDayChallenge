package CodeChallenges;

public class LongestRepeatingCharacter {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int maxFq = 0;
        char[] str = s.toCharArray();
        int[] hash = new int[26];
        while (right < s.length()) {
            hash[str[right] - 'A']++;
            maxFq = Math.max(maxFq, hash[str[right] - 'A']);
            if ((right - left + 1) - maxFq > k) {
                hash[str[left] - 'A']--;
                maxFq = 0;
                left = left + 1;
            }
            if ((right - left + 1) - maxFq <= k) {
                maxLen = Math.max(maxLen, (right - left + 1));
            }
            right++;
        }
        return maxLen;
    }
}
