import CodeChallenges.FrogJump;

public class App {
    public static void main(String[] args) throws Exception {
        FrogJump frogJump = new FrogJump();
        int[] height = { 30, 20, 50, 10 };
        System.out.println(frogJump.minCost(height));
    }
}
