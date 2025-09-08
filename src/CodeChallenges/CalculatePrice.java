package CodeChallenges;

public class CalculatePrice {
    public int calPrice(int[] price){
        if (price.length ==0){
            return 0;
        }
        int lowestPrice = Integer.MAX_VALUE;
        int highestPrice = Integer.MIN_VALUE;
        int discountPrice = 0;

        for (int i = 0; i < price.length; i++){
            if (price[i] < lowestPrice) {
                lowestPrice = price[i];
            }
            if (price[i] > highestPrice) {
                System.out.println(highestPrice);
                highestPrice = price[i];
            }
        }

        discountPrice = highestPrice-lowestPrice;

        return discountPrice;
    }
}



//    public int calPrice(int[] price) {
//        if (price.length == 0) {
//            return 0;  // Edge case for empty array
//        }
//
//        int lowestPrice = Integer.MAX_VALUE;
//        int highestPrice = Integer.MIN_VALUE;
//        int discountPrice = 0;
//
//        // Find the lowest and highest price in the array
//        for (int i = 0; i < price.length; i++) {
//            if (price[i] < lowestPrice) {
//                lowestPrice = price[i];
//            }
//            if (price[i] > highestPrice) {
//                highestPrice = price[i];
//            }
//        }
//
//        // Calculate the discount price
//        discountPrice = highestPrice - lowestPrice;
//
//        return discountPrice;
//    }