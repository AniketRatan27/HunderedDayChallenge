package CodeChallenges;

public class MinimumSortedArray {
    public int findMin(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right){
            int middle = (left + right)/2;

            if (nums[middle] == target)return middle;

            if (nums[middle] > nums[right]){
                left = middle + 1;
            }else {
                right = middle;
            }
        }
        return -1;
    }
}
