package CodeChallenges;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public  int removeDuplicate(int[] nums) {
        int i = 0;
//        HashSet<Integer> hashSet = new HashSet<>();
//        for (int i = 0;i<nums.length;i++){
////            if (nums[i]!=nums[i-1]){
////                nums[idx++] = nums[i - 1];
////            }
//            hashSet.add(nums[i]);
//        }
//        for (int st:hashSet){
//            nums[idx] = st;
//            idx++;
//        }
//        return idx;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return i+1;
    }
}
