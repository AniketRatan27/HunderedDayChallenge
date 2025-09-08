package CodeChallenges;

public class RotatedSortedArrrayII {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int mid = (low + high) / 2;

        if (nums[mid] == target)
            return true;
        else {
            for (int i = low; i <= mid - 1; i++) {
                if (nums[i] == target)
                    return true;
            }
            for (int i = mid; i <= high; i++) {
                if (nums[i] == target)
                    return true;
            }
        }
        return false;
    }
}
