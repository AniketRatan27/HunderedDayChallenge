package CodeChallenges;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfSquaredNumber {

    public List<Integer> squaredArray(int[] nums){
        List<Integer> list = new ArrayList<>();

        int i = 0;
        while (i <= nums.length - 1){
            list.add(nums[i] * nums[i]);
            i++;
        }
        return list;
    }
}
