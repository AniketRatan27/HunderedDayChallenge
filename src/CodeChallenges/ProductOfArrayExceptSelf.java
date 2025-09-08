package CodeChallenges;

public class ProductOfArrayExceptSelf {

    public int[] findTheProductExceptSelf(int[] arr){

        int productSum = 1;

        int[] productArray = new int[arr.length];

        for (int i = 0; i<arr.length; i++){

            int current = arr[i];

            for (int j = 0; j<arr.length; j++){

                if(current == arr[j]) continue;

                else {
                    System.out.println(" "+productSum+" "+arr[j]);
                    productSum *= arr[j];
                }
            }
            productArray[i] = productSum;
            productSum = 1;
        }
        return productArray;
    }
}

