package CodeChallenges;

import java.util.Arrays;

public class MeasurementOfArray {
    public int measureArray(int[] arr) {
        int firstOccurence = 0;
        int lastOccurence = 0;
        int sum = 0;
        int i = 0;
        int n = arr.length;
        int[] arrCopy = Arrays.copyOf(arr, n);
        while (i < n) {
            int element = arr[i];
            firstOccurence = i;
            lastOccurence = lastOccurenceIndex(element, arrCopy);
            sum += (firstOccurence + lastOccurence);
            i++;
        }
        return sum;
    }

    private int lastOccurenceIndex(int element, int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (element == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
