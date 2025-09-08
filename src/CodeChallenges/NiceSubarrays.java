package CodeChallenges;

public class NiceSubarrays {
    public int numberOfNiceSubarrays(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int odds = 0;
        int cnt = 0;
        while (right < nums.length) {
            if (nums[right] % 2 != 0)
                odds++;
            while (odds > k) {
                if (nums[left] % 2 != 0)
                    odds--;
                left++;
            }
            cnt = cnt + (right - left + 1);
            right++;
        }
        return cnt;
    }
}
