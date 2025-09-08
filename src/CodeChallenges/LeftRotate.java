package CodeChallenges;

import java.util.Arrays;

public class LeftRotate {
    public void leftRotate(int[] nums,int k){
        int n = nums.length;
        if(n == 0) return;
        k = k%n;
        if (k>n)return;
        int[] temp = new int[k];
        for (int i = n-k; i < n; i++) {
            temp[i-n+k] = nums[i];
        }
        for (int i = n-k-1; i >= 0; i--) {
            nums[i+k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}


/**    int op = 0;
    int n = nums.length;
        k = k%n;
                while (op != k){
                int  temp = nums[n-1];
                for (int i = n - 1;i>0;i--){
                nums[i] = nums[i-1];
                }
                nums[0] = temp;
                op++;
                }
                return nums;
 **/

/**
 * for (int i = 1; i <=nums.length - 1; i++) {
 *             nums[i-1] = nums[i];
 *             if (i == nums.length - 1){
 *                 nums[i] = temp;
 *                 break;
 *             }
 *         }
 */