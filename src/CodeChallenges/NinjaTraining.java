package CodeChallenges;

import java.util.Arrays;

public class NinjaTraining {

    private int trainNinja(int days, int last, int[][] arr, int[][] dp) {
        if (days == 0) {
            int maxi = 0;
            for (int task = 0; task < 3; task++) {
                if (last != task) {
                    maxi = Math.max(maxi, arr[0][task]);
                }
            }
            return maxi;
        }
        if (dp[days][last] != -1)
            return dp[days][last];

        int maxi = 0;
        for (int task = 0; task < 3; task++) {
            if (last != task) {
                int point = arr[days][task] + trainNinja(days - 1, task, arr, dp);
                maxi = Math.max(maxi, point);
            }
        }
        return dp[days][last] = maxi;
    }

    public int maximumPoints(int[][] arr) {
        int n = arr.length;
        int[][] dp = new int[n][4];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        return trainNinja(n - 1, 3, arr, dp);
    }
}
