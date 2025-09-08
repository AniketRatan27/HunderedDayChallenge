package CodeChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public List<List<Integer>> merge(int[][] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<n; i++){
            if(ans.isEmpty() || nums[i][0] > ans.get(ans.size() - 1).get(1)){
                ans.add(Arrays.asList(nums[i][0],nums[i][1]));
            }else{
                ans.get(ans.size() - 1).set(1, Math.max(ans.get(ans.size() - 1).get(1),nums[i][1]));
            }
        }
        return ans;
    }
}
















/* 
    2nd Method
    List<List<Integer>> ans = new ArrayList<>();

       int n = nums.length;
       for (int i = 0; i<n; i++){
        int start = nums[i][0];
        int end = nums[i][1];
        if( !ans.isEmpty() && end <= ans.get(ans.size - 1).get(1)) continue;

        for (int j = i + 1; j < n; j++) {
            if (nums[j][0] <= end) {
                end = Math.max(end,nums[j][1]);
            }else{
                break;
            }
            ans.add(Arrays.asList(start,end));
        }
       }
       return ans;
*/ 


/*
 *  Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));

        List<int[]> merged = new ArrayList<>();

        for (int[] interval : intervals){
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]){
                merged.add(interval);
            }else{
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1],interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
 */