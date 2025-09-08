package CodeChallenges;

public class MaximumSubarray {
    public int subArrayMin(int[] nums){
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;

        int sum = 0;
        for(int i = 0;i<n;i++){
                sum = sum+nums[i];
                System.out.println("sum"+sum);
                maxi = Math.max(sum,maxi);
                if (sum<0){
                    sum = 0;
                }
            }
        return maxi;
    }
}




/**
    int maxi = Integer.MIN_VALUE;
    int n = nums.length;

        for(int i = 0;i<n;i++){
        int sum = 0;
        for(int j = i;j<n; j++){
        sum = sum+nums[j];
        maxi = Math.max(sum,maxi);
        }
        }
        return maxi;
 **/