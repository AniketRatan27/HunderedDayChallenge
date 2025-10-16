import java.util.ArrayList;
import java.util.List;

import CodeChallenges.AdjacentIncreasingSubarray;
import CodeChallenges.MinimumPathSum;
import CodeChallenges.UniquePathII;

public class App {
    public static void main(String[] args) throws Exception {
        AdjacentIncreasingSubarray adjacentIncreasingSubarray = new AdjacentIncreasingSubarray();
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(1);

        System.out.println(adjacentIncreasingSubarray.hasIncreasingSubarray(list, 3));
    }
}
