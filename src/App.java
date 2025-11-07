import CodeChallenges.MinimumFallingPathSum;

public class App {
    public static void main(String[] args) throws Exception {
        MinimumFallingPathSum mPathSum = new MinimumFallingPathSum();
        int[][] arr = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
        System.out.println(mPathSum.minimumFallingPath(arr));
    }
}
