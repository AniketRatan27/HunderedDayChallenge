package CodeChallenges;

public class FindPeakElementII {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int low = 0;
        int high = m - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int rowMax = maxRow(mat, n, m, mid);

            int left = mid - 1 >= 0 ? mat[rowMax][mid - 1] : -1;
            int right = mid + 1 < m ? mat[rowMax][mid + 1] : -1;

            if (mat[rowMax][mid] > left && mat[rowMax][mid] > right) {
                return new int[] { rowMax, mid };
            } else if (mat[rowMax][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[] { -1, -1 };
    }

    public int maxRow(int[][] mat, int n, int m, int col) {
        int index = -1;
        int maxElement = -1;
        for (int i = 0; i < n; i++) {
            if (mat[i][col] > maxElement) {
                maxElement = mat[i][col];
                index = i;
            }
        }
        return index;
    }
}
