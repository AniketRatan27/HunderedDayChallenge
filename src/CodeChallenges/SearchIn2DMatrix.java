package CodeChallenges;

public class SearchIn2DMatrix {
    /*
     * public boolean searchMatrix(int[][] matrix, int target) {
     * for (int i = 0; i < matrix.length; i++) {
     * int left = 0;
     * int right = matrix[i].length - 1;
     * 
     * while (left <= right) {
     * int mid = left + (right - left) / 2;
     * 
     * if (matrix[i][mid] == target)
     * return true;
     * else if (matrix[i][mid] < target) {
     * left = mid + 1;
     * } else {
     * right = mid - 1;
     * }
     * }
     * }
     * return false;
     * }
     */

    // Approach 2nd
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;
        int right = (n * m) - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            int row = mid / m;
            int col = mid % m;

            if (matrix[row][col] == target)
                return true;
            else if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
