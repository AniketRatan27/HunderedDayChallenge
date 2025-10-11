public class UniquePathII {
    private int deSelectUniquePath(int i, int j, int[][] obstacle, int[][] dp) {
        if (i >= 0 && j >= 0 && obstacle[i][j] == 1)
            return 0;
        if (i == 0 && j == 0)
            return 1;
        if (dp[i][j] != -1)
            return dp[i][j];

        int up = deSelectUniquePath(i - 1, j, obstacle, dp);
        int left = deSelectUniquePath(i, j - 1, obstacle, dp);
        return dp[i][j] = up + left;
    }
}
