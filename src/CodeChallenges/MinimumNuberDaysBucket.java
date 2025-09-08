package CodeChallenges;

public class MinimumNuberDaysBucket {
    public int minDays(int[] bloomDay, int m, int k) {
        long val = m * 1l * k * 1l;
        if (val > bloomDay.length)
            return -1;

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            mini = Math.min(mini, bloomDay[i]);
            maxi = Math.max(maxi, bloomDay[i]);
        }
        int low = mini;
        int high = maxi;
        int ans = high;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (possibility(bloomDay, mid, m, k) == true) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private boolean possibility(int[] bloomDay, int days, int m, int k) {
        int noOfBucket = 0;
        int count = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= days) {
                count++;
            } else {
                noOfBucket += (count / k);
                count = 0;
            }
        }
        noOfBucket += (count / k);
        return noOfBucket >= m;
    }
}
