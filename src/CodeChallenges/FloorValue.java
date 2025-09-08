package CodeChallenges;

public class FloorValue {
    /*
     * Here we are calculating the floor value that is second largest to the given
     * value
     */
    public int floor(int[] nums, int x) {
        int ans = -1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= x) {
                ans = nums[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
