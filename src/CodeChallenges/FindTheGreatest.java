package CodeChallenges;

public class FindTheGreatest {
    public int findGreatest(int[] arr){
        int greatest = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if(arr[i]>greatest) {
                greatest = arr[i];
            }
        }
        return greatest;
    }
}
