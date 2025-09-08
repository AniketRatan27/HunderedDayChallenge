package CodeChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheTriplets {
    public List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i>0 && nums[i] == nums[i-1]) continue;

            int left = i+1;
            int right = nums.length - 1;

            while (left<right){
                int sum = nums[i] + nums[left]+nums[right];

                if (sum == 0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    left++;
                    right--;

                    while (left<right && nums[left] == nums[left-1]) left++; // because our pointer is going from left to right,[-3,-1,0,0,3,3]
                    while (left<right && nums[right] == nums[right+1]) right--;
                } else if (sum < 0) {
                    left++;
                }else {
                    right--;
                }
            }
        }
        return result;
    }
}
