package CodeChallenges;

import java.util.List;

public class FindTimesArrayRotated {
    public int FindTimesArrayRotated(List<Integer> arr) {
        int frequencyArrayRotated = 0;
        int initial = 0;
        int positon = 0;
        int n = arr.size();
        if (arr.size() - 1 == 0)
            return frequencyArrayRotated;
        else {
            for (int i = 0; i < n - 1; i++) {
                if (arr.get(i) < arr.get(i + 1)) {
                    // do nothing, just continue to next iteration
                    continue;
                } else {
                    positon = i + 1;
                }
            }
        }
        frequencyArrayRotated = Math.max(initial, positon);
        return frequencyArrayRotated;
    }
}
