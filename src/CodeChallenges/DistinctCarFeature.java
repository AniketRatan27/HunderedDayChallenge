package CodeChallenges;

public class DistinctCarFeature {
    public int distinctCarFeature(int[] arr) {
        int maxDistance = 0;
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] != arr[j]) {
                maxDistance = Math.max(maxDistance, Math.abs(i - j));
            }
            i++;
        }
        return maxDistance;
    }
}
