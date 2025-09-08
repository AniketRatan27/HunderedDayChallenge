package CodeChallenges;

import java.util.Arrays;

public class ArrayOperation {
    public int[] applyOperations(int[] nums){
        int i = 0;
        int n = nums.length;
        while (i!=nums.length-1){
            if (nums[i]==nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
            i++;
        }
        int[] result = new int[n];
        int index = 0;

        for (int num : nums) {
            if (num != 0) {
                result[index++] = num;
            }
        }
        return result;
    }
}
