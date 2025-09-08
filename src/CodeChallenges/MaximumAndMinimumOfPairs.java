package CodeChallenges;

public class MaximumAndMinimumOfPairs {
    public int minimizeMax(int[] nums, int p) {
        int low = 0;
        int high = nums[nums.length - 1] - nums[0];
        int result = high;
        while (low <= high) {
            int mid = low + high / 2;
            if (weCanFormPair(nums, p, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public boolean weCanFormPair(int[] nums, int p, int maxDiff) {
        int count = 0;
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i + 1] - nums[i] <= maxDiff) {
                count++;
                i += 2;
            } else {
                i++;
            }
        }
        return count >= p;
    }
}
