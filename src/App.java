import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import CodeChallenges.ArrayStrictlyIncreasing;
import CodeChallenges.ConcatenateString;
import CodeChallenges.DistinctCarFeature;
import CodeChallenges.LongestConsecutiveCharacters;
import CodeChallenges.TestScores;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayStrictlyIncreasing increasing = new ArrayStrictlyIncreasing();
        int[] nums = { 2, 3, 1, 2 };
        System.out.println(increasing.canBeIncreasing(nums));
    }
}
