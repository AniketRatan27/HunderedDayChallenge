package CodeChallenges;

public class SplitArrayLargestSum {
    public int splitArray(int[] nums, int k) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, nums[i]);
            sum += nums[i];
        }
        int low = maxi;
        int high = sum;
        while (low <= high) {
            int mid = (low + high) / 2;
            int splitedArray = arraySplit(nums, mid);
            if (splitedArray > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private int arraySplit(int[] nums, int barrier) {
        int cntSplitArrays = 1;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] <= barrier) {
                sum += nums[i];
            } else {
                cntSplitArrays += 1;
                sum = nums[i];
            }
        }
        return cntSplitArrays;
    }
}
