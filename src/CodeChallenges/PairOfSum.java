package CodeChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairOfSum {
    public int[] pairOfSum(int[]nums, int target){
        int[] result = new int[2];
        int i=0;

        while (i< nums.length-1){
            int current = i;
            int next = i+1;
            int j = 0;
                int sumOfPair = nums[current]+nums[next];
                if (sumOfPair == target) {
                    result[j] = current;
                    result[j+1] = next;
                }
                i++;
        }
        return result;
    }
}
