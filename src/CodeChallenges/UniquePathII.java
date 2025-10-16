package CodeChallenges;

import java.util.Arrays;

public class UniquePathII {
    private int deSelectUniquePath(int i, int j, int[][] obstacle, int[][] dp) {
        if (i < 0 || j < 0)
            return 0;

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

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        return deSelectUniquePath(m - 1, n - 1, obstacleGrid, dp);
    }
}
