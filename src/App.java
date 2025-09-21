import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import CodeChallenges.ArrayStrictlyIncreasing;
import CodeChallenges.ConcatenateString;
import CodeChallenges.DistinctCarFeature;
import CodeChallenges.FindPeakElementII;
import CodeChallenges.LongestConsecutiveCharacters;
import CodeChallenges.MergeIntervals;
import CodeChallenges.SearchIn2DMatrix;
import CodeChallenges.TestScores;

public class App {
    public static void main(String[] args) throws Exception {
        FindPeakElementII fElementII = new FindPeakElementII();
        int[][] matrix = { { 1, 4 }, { 3, 2 } };

        System.out.println(Arrays.toString(fElementII.findPeakGrid(matrix)));
    }
}
