import CodeChallenges.NinjaTraining;

public class App {
    public static void main(String[] args) throws Exception {
        NinjaTraining ninjaTraining = new NinjaTraining();
        int[][] arr = { { 1, 2, 5 }, { 3, 1, 1 }, { 3, 3, 3 } };
        System.out.println(ninjaTraining.maximumPoints(arr));
    }
}
