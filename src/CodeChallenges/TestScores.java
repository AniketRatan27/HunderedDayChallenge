package CodeChallenges;

public class TestScores {
    public int[] testScore(int[] scores, int[] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            for (int j = 0; j < scores.length; j++) {
                if (scores[j] >= queries[i]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
