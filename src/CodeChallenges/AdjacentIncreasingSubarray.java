package CodeChallenges;

import java.util.List;

public class AdjacentIncreasingSubarray {

    private boolean isIncreasing(List<Integer> nums, int start, int k) {
        for (int i = start; i < start + k - 1; i++) {
            if (nums.get(i) >= nums.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean hasIncreasingSubarray(List<Integer> nums, int k) {
        int n = nums.size();
        for (int i = 0; i + 2 * k - 1 <= n; i++) {
            boolean first = isIncreasing(nums, i, k);
            boolean second = isIncreasing(nums, i + 1, k);

            if (first && second) {
                return true;
            }
        }
        return false;
    }
}
