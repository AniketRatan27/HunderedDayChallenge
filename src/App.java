import CodeChallenges.FrogJump;
import CodeChallenges.FrogJumpII;
import CodeChallenges.HouseRobber;
import CodeChallenges.MaximumSumOfNonAdjacentNumbers;

public class App {
    public static void main(String[] args) throws Exception {
        HouseRobber sHouseRobber = new HouseRobber();
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(sHouseRobber.rob(nums));
    }
}
