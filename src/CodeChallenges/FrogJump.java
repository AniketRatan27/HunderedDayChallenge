package CodeChallenges;

import java.util.Arrays;

public class FrogJump {
    public int minCost(int[] height) {
        int[] dp = new int[height.length];
        Arrays.fill(dp, -1);
        return frogJump(height, height.length - 1, dp);
    }

    private int frogJump(int[] height, int ind, int[] dp) {
        if (ind == 0)
            return 0;
        if (dp[ind] != -1)
            return dp[ind];
        int left = frogJump(height, ind - 1, dp) + Math.abs(height[ind] - height[ind - 1]);
        int right = Integer.MAX_VALUE;
        if (ind > 1) {
            right = frogJump(height, ind - 2, dp) + Math.abs(height[ind] - height[ind - 2]);
        }
        return dp[ind] = Math.min(left, right);
    }
}
