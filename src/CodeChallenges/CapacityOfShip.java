package CodeChallenges;

public class CapacityOfShip {
    public int shipWithCapacity(int[] weigth, int days) {
        int maxi = Integer.MIN_VALUE;
        int sumOfWeigth = 0;
        for (int i = 0; i < weigth.length; i++) {
            maxi = Math.max(maxi, weigth[i]);
            sumOfWeigth += weigth[i];
        }

        int low = maxi;
        int high = sumOfWeigth;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (miniDays(weigth, mid) <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private int miniDays(int[] weigth, int capacity) {
        int days = 1;
        int load = 0;
        for (int i = 0; i <= weigth.length - 1; i++) {
            if (load + weigth[i] > capacity) {
                days = days + 1;
                load = weigth[i];
            } else {
                load += weigth[i];
            }
        }
        return days;
    }
}
