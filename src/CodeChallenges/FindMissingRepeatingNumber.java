package CodeChallenges;

public class FindMissingRepeatingNumber {
    public void findRepeatAndMissing(int[] nums){
        int[] hash = new int[nums.length+1];
        int n = nums.length;
        for (int i = 0; i < n; i++){
            hash[nums[i]]++;
        }
        int repeat = -1;
        int missing = -1;
        
        for(int i = 1; i<hash.length; i++){
            
            if(hash[i] == 0){
                missing = i;
            }
            else if (hash[i] > 1){
                repeat = i;
            }
        }
        System.out.println(" Repeat: "+repeat);
        System.out.println(" Missing: "+missing);
        
    }    
}
