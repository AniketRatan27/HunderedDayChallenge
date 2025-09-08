package CodeChallenges;

import java.util.Arrays;

public class LengthOfLongestSubString {
    public int subStringLength(String s) {
        char[] str = s.toCharArray();
        int length = 0;
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int[] hash = new int[256];
        Arrays.fill(hash, -1);
        while (right < s.length()) {
            if (hash[str[right]] != -1) {
                if (hash[str[right]] >= left) {
                    left = hash[str[right]] + 1;
                }
            }
            length = right - left + 1;
            maxLength = Math.max(maxLength, length);
            hash[str[right]] = right;
            right++;
        }
        return maxLength;
    }
}
