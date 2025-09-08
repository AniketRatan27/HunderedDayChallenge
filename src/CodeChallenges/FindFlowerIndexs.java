package CodeChallenges;

public class FindFlowerIndexs {

    public int[] findFlowerIndexs(int t, int[] arr){
            int left = 0;
            int right = arr.length - 1;
            while (left<right){
                int sum = arr[left]+arr[right];
                if (sum == t){
                    return new int[]{left,right};
                } else if (sum < t) {
                    left++;
                }else {
                    right--;
                }
            }
        return new int[]{0,0};
    }
}
