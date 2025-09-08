package CodeChallenges;

public class KokoEatingBanana {
    public int minEatingSpeed(int[] nums, int h) {
        int low = 1;
        int high = maxElement(nums);
        int ans = high;
        while (low <= high) {
            int mid = (low + high) / 2;
            long totalHours = findTotalHours(nums, mid);
            if (totalHours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private int maxElement(int[] nums) {
        int maxElemt = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxElemt) {
                maxElemt = nums[i];
            }
        }
        return maxElemt;
    }

    private long findTotalHours(int[] nums, int k) {
        long totalHrs = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            totalHrs += totalHrs += (nums[i] + k - 1l) / k;
        }
        return totalHrs;
    }
}
