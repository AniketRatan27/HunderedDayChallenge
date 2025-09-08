package CodeChallenges;

public class FindMinimumFromSorted {
    public int findMinimum(int[] nums) {
        int low = 0;
        int high = nums.length;
        int mid = (low + high) / 2;
        int mini = nums[mid];

        if (nums.length == 0)
            return mid;
        else {
            for (int i = low; i <= mid - 1; i++) {
                if (nums[i] < mini)
                    mini = nums[i];
            }
            for (int i = mid + 1; i <= high - 1; i++) {
                if (nums[i] < mini)
                    mini = nums[i];
            }
        }
        return mini;
    }
}
