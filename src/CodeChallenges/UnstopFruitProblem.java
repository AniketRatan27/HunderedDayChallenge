package CodeChallenges;

import java.util.Arrays;

public class UnstopFruitProblem {
    public int maxSum(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int maxSum = 0;

        for (int i = 0; i < n - 1; i += 2) {
            maxSum += Math.min(arr[i], arr[i + 1]);
        }
        return maxSum;
    }
}
