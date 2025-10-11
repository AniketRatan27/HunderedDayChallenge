import CodeChallenges.NinjaTraining;
import CodeChallenges.UniquePath;

public class App {
    public static void main(String[] args) throws Exception {
        UniquePath uniquePath = new UniquePath();
        int m = 3;
        int n = 2;
        System.out.println(uniquePath.uniquePath(m, n));
    }
}
