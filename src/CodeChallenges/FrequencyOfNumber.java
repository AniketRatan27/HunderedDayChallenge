package CodeChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrequencyOfNumber {
    public List<Integer> frequencyCount(int arr[]){
        int n = arr.length;
        List<Integer> list = new ArrayList<>();

        int[] hash = new int[n + 1];
        for (int i = 0; i<n; i++){
            if (arr[i] >= 1 && arr[i]<=n){
                hash[arr[i]]+=1;
            }
        }
        for (int i = 1; i <= n; i++) {
            list.add(hash[i]);
        }
        return list;
    }
}
