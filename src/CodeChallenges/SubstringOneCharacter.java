package CodeChallenges;

public class SubstringOneCharacter {
    public int numberOfSubstrings(String s) {
        char[] str = s.toCharArray();
        int[] hash = { -1, -1, -1 };
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            hash[str[i] - 'a'] = i;
            if (hash[0] != -1 && hash[1] != -1 && hash[2] != -1) {
                int firstTwoMin = Math.min(hash[0], hash[1]);
                cnt = cnt + (Math.min(firstTwoMin, hash[2]) + 1);
            }
        }
        return cnt;
    }
}
