package CodeChallenges;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1,int[] nums2){
        int m = nums1.length;
        int n = nums2.length;

        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                if (nums1[j] == 0) {
                    nums1[j] = nums2[i];
                    break;
                }
            }
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
