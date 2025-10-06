package CodeChallenges;

public class FrogJumpII {
    public int maxJump(int[] stones) {
        int n = stones.length;
        int low = 0;
        int high = stones[n - 1] - stones[0];
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canDo(stones, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private boolean canDo(int[] stones, int k) {
        for (int i = 0; i + 2 < stones.length; i++) {
            if (stones[i + 2] - stones[i] > k)
                return false;
        }
        return true;
    }
}
