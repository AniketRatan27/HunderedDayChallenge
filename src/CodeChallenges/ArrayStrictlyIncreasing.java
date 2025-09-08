package CodeChallenges;

public class ArrayStrictlyIncreasing {
    public boolean canBeIncreasing(int[] nums) {
        int count = 0;
        for (int i = 1; i <= nums.length - 1; i++) {
            if (nums[i] <= nums[i - 1]) {
                count++;
                if (count > 1) {
                    return false;
                }
                if (i > 1 && nums[i] <= nums[i - 2]) {
                    nums[i] = nums[i - 1]; // pretend removing nums[i]
                }
            }
        }
        return true;
    }
}
