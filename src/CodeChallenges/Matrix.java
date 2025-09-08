package CodeChallenges;

public class Matrix {
    public void matrix(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0){
                    markRow(arr,i);
                    markCol(arr,j);
                }
                System.out.print(arr[i][j]+" ");
            }
                System.out.println();
        }
    }
    public void markRow(int[][] arr,int i){
        for (int j = 0; j <arr[0].length; j++) {
            if (arr[i][j] != 0){
                arr[i][j] = -1;
            }
        }
    }
    public void markCol(int[][] arr, int j){
    for (int i = 0; i < arr.length; i++) {
            if (arr[i][j] != 0){
                arr[i][j] = -1;
            }
        }
    }
}
