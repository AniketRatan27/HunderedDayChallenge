package CodeChallenges;

import java.util.ArrayList;
import java.util.List;

public class RecusionSubsequence {
    public void subsequence(int index, int[] arr, List<Integer> list, List<List<Integer>> res){
        if (index == arr.length){
            res.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[index]);
        subsequence(index+1,arr,list,res);
        list.remove(list.size() - 1);
        subsequence(index+1,arr,list,res);
    }
}
