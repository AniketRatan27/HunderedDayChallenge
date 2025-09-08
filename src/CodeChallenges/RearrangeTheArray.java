package CodeChallenges;

public class RearrangeTheArray {
    public int[] rearrangeArray(int[] nums){
        int n = nums.length;

        int[] arr = new int[n];
        int negindex = 1;
        int posindex = 0;

        for(int i = 0;i<n;i++){
            if (nums[i]<0){
                arr[negindex] = nums[i];
                negindex +=2;
            }
            else{
                arr[posindex] = nums[i];
                posindex +=2;
            }
        }

        return arr;
    }
}









/**
 *
 *int[]posArray=new int[n/2];
 *int[] negArray = new int[n/2];
 *
for(int i = 0;i<n;i++){
        if (nums[i]>0){
        posArray[posindex++] = nums[i];
        }
        else{
        negArray[negindex++] = nums[i];
        }
        }

for(int i = 0;i<n/2;i++){
        nums[2*i] = posArray[i];
        nums[2*i+1] = negArray[i];
        } */