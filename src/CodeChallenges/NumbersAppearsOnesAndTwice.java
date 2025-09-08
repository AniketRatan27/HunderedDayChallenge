package CodeChallenges;

import java.util.HashSet;

public class NumbersAppearsOnesAndTwice {
    public void numberAppearedOnes(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        int got = 0;
        for (int num : nums) {
            set.add(num);
        }
        int[] hash = new int[set.size()+1];
        for (int num : nums) {
            hash[num]++;
        }

        for (int i = 1;i<hash.length;i++){
            if (hash[i] == 1){
                got = i;
                break;
            }
        }
        System.out.println("ones: "+got);
//        return got;
    }
}


//for (int i = 0; i < nums.length; i++) {
//        hash[nums[i]]++;
//        }