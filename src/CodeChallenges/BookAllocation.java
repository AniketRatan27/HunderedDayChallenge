package CodeChallenges;

public class BookAllocation {
    public int findPages(int[] arr, int k) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(arr[i], maxi);
            sum += arr[i];
        }
        if (k > arr.length)
            return -1;
        int low = maxi;
        int high = sum;
        while (low <= high) {
            int mid = (low + high) / 2;
            int noOFStudent = isPossible(arr, mid);
            if (noOFStudent > k)
                low = mid + 1;
            else {
                high = mid - 1;
            }
        }
        return low;
    }

    private int isPossible(int[] arr, int barrier) {
        int cntStudent = 1;
        long pages = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (pages + arr[i] <= barrier) {
                pages += arr[i];
            } else {
                cntStudent += 1;
                pages = arr[i];
            }
        }
        return cntStudent;
    }
}
