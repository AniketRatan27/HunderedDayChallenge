package CodeChallenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequenceOfMostFrequentElement {
    public int maxFrequency(int[] nums, int k){
        int n = nums.length - 1;
        for (int i = 0;i<=n; i++){
            int operation = Math.abs(nums[i]-nums[n]);
            if (operation<=k) {
                nums[i] = nums[i] + operation;
                k = k - operation;
            }
        }

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <= n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i],1);
            }
        }
        for (int mp : map.values()){
            if (mp > 1)return mp;
        }
        return 1;
    }
}




//        [1,2,4] k=5
//        System.out.println(map.values());
//        System.out.println(Arrays.toString(arr));
