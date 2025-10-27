package CodeChallenges;

public class SmallestMissingNonNegativeIntegerOperations {
    public int findSmallestInteger(int[] nums, int value) {
        int[] count = new int[value];

        for (int num : nums) {
            int r = ((num % value) + value) % value;
            count[r]++;
        }

        int i = 0;
        while (true) {
            int remainder = i % value;
            if (count[remainder] > 0) {
                count[remainder]--;
                i++;
            } else {
                return i;
            }
        }

    }
}
