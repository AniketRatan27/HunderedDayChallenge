package CodeChallenges;

public class SmallestDivisor {
    public int getSmallestDivisor(int[] nums, int threshold) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            mini = Math.min(mini, nums[i]);
            maxi = Math.max(maxi, nums[i]);
        }
        int low = mini;
        int high = maxi;
        int sum = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            sum = getSumOfDivisor(nums, mid);
            if (sum <= threshold) {
                high = mid - 1;
            } else {
                low = low + 1;
            }
        }
        return low;
    }

    private int getSumOfDivisor(int[] nums, int divisor) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Math.ceil((double) nums[i] / divisor);
        }
        return sum;
    }
}
