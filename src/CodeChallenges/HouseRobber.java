package CodeChallenges;

public class HouseRobber {

    private int robLinear(int nums[], int start, int end) {
        int prev2 = 0;
        int prev = 0;

        for (int i = start; i <= end; i++) {
            int take = nums[i] + prev2;
            int notTake = 0 + prev;
            int curi = Math.max(take, notTake);

            prev2 = prev;
            prev = curi;
        }
        return prev;
    }

    public int rob(int nums[]) {
        int n = nums.length;

        if (n == 1)
            return nums[0];
        if (n == 0)
            return 0;
        int max1 = robLinear(nums, 0, n - 2);
        int max2 = robLinear(nums, 1, n - 1);
        return Math.max(max1, max2);
    }
}
