package CodeChallenges;

import java.util.Arrays;

public class MinimumFallingPathSum {

    private int getFallingPath(int i, int j, int[][] arr, int[][] dp) {
        int n = arr.length;
        int m = arr[0].length;

        if (j < 0 || j > n - 1)
            return (int) 1e9;
        if (i == 0)
            return arr[0][j];

        if (dp[i][j] != -1)
            return dp[i][j];

        int up = arr[i][j] + getFallingPath(i - 1, j, arr, dp);
        int leftDiag = arr[i][j] + getFallingPath(i - 1, j - 1, arr, dp);
        int rightDiag = arr[i][j] + getFallingPath(i - 1, j + 1, arr, dp);

        return dp[i][j] = Math.min(up, Math.min(rightDiag, leftDiag));
    }

    public int minimumFallingPath(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int min = Integer.MAX_VALUE;
        // Try all possible end positions in the last row
        for (int j = 0; j < m; j++) {
            min = Math.min(min, getFallingPath(n - 1, j, matrix, dp));
        }
        return min;
    }
}
