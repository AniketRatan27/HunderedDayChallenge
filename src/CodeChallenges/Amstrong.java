package CodeChallenges;

public class Amstrong {
    public Boolean isAmstrongNum(int num) {
        int sum = 0;
        int com = num;

        while (num != 0) {
            int rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        if (sum == com) {
            return true;
        }
        return false;
    }
}
