package CodeChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSums {
    public List<List<Integer>> fourSum(int[] nums,int target){
        List<List<Integer>> flist = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i<n; i++){
            if (i>0 && nums[i] == nums[i-1]) continue;
            for (int j = i+1; j<n; j++){
                if (j!=i+1 && nums[j] == nums[j-1]) continue;

                int k = j+1;
                int l = n-1;

                while (k<l) {
                    int sum = nums[i];
                    sum+=nums[j];
                    sum+=nums[k];
                    sum+=nums[l];

                    if (sum == target){
                        List<Integer> arr = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        flist.add(arr);
                        k++;
                        l--;

                        while (k<l && nums[k] == nums[k-1])k++;
                        while (k<l && nums[l] == nums[l+1])l--; 
                    }
                    else if (sum < target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }
        return flist;
    } 
}








 /* 
Set<List<Integer>> ans = new HashSet<>();
        
        
        Arrays.sort(nums);
        int n = nums.length;
        for (int a = 0; a<n; a++){
            for (int b = a+1; b<n; b++){
                for (int c = b+1; c < n; c++) {
                    int sum = 0;
                    for (int d = c+1; d < n; d++) {
                        sum = nums[a]+nums[b]+nums[c]+nums[d];
                        if (sum == target) {
                            List<Integer> temp = Arrays.asList(nums[a],nums[b],nums[c],nums[d]);
                            ans.add(temp);
                        }
                    }
                }
            }
        }
        // System.out.println(ans);
        return ans;
*/