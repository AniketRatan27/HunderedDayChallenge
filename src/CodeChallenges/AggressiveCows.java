package CodeChallenges;

public class AggressiveCows {
    public int agressiveCows(int[] stalls, int cows) {
        int n = stalls.length;
        int low = 0;
        int high = stalls[n - 1] - stalls[0];
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canWePlaceCows(stalls, mid, cows) == true) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    public boolean canWePlaceCows(int[] stalls, int dist, int cows) {
        int cntCows = 1;
        int last = stalls[0];
        for (int i = 1; i <= stalls.length - 1; i++) {
            if ((stalls[i] - last) >= dist) {
                cntCows++;
                last = stalls[i];
            }
        }
        if (cntCows >= cows) {
            return true;
        } else {
            return false;
        }
    }
}
