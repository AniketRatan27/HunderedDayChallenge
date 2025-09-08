package CodeChallenges;

import java.util.Arrays;

public class EqualArrayElements {
    // find the minimum in the array list by sorting it and take the second minimum value
    // then take the diff between the diff and the min and store it in the countAE variable
    // but if there is any value that is less than the min then take its remainder and add them.
    public int minMoves(int[] nums){
        Arrays.sort(nums);
        int median = nums[nums.length/2];
        int moves = 0;

        for (int num: nums){
            moves += Math.abs(num-median);
        }
        return moves;
    }
}
