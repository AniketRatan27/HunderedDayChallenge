package CodeChallenges;

import java.util.HashSet;

public class LongestConsecutiveSubarray {
    public int longestConsecutive(int[] arr){
        int x = 0;
        int n = arr.length;
        int longest = 0;
        for (int i = 0; i<n; i++){
            x = arr[i];
            int cnt = 1;
            while (linearSearch(arr, x+1) == true){
                x = x+1;
                cnt = cnt+1;
            }
            longest = Math.max(longest,cnt);
        }
        return longest;
    }
    public Boolean linearSearch(int[] arr,int x){
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == x) return true;
        }
        return false;
    }
}

















/*
 * Arrays.sort(arr);

        int n = arr.length;
        int highestElement = Integer.MIN_VALUE;
        for (int i = 0; i<n - 1; i++){
            if (arr[i+1]>arr[i]){
                highestElement = Math.max(highestElement,arr[i+1]);
            }
        }
        System.out.println("Highest element: "+highestElement);
        int[] hash = new int[highestElement+1];
        for(int i = 0; i<n; i++){
            hash[arr[i]] = hash[arr[i]]+1;
            System.out.println("HashArray: "+hash[i]+"=> "+i);
        }

        System.out.println(Arrays.toString(hash));

        ArrayList<Integer> listOfArray = new ArrayList<>();
        for (int i = 1;i<hash.length;i++){
            for (int j = i;j<hash.length;j++){
                if (hash[j]>0){
                    listOfArray.add(j);
                }else {
                    break;
                }
            }
        }
        System.out.println(listOfArray);
 */