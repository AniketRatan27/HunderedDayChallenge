package CodeChallenges;

public class CountPositiveNegative {
    public int  maximumCount(int[] nums){
        int pos = 0;
        int neg = 0;
        int maxi = 0;
        for (int i = 0; i<nums.length;i++) {
            if(nums[i]>0)pos++;
            else if (nums[i]<0) neg++;
            else return 0;
        }
        maxi = Math.max(pos,neg);

        return maxi;
    }
}
