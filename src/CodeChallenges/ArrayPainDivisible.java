package CodeChallenges;


public class ArrayPainDivisible {
    public boolean pairDivisible(int[] arr, int k){
        int[] remainderCount = new int[k];

        for (int num : arr) {
            int remainder = num % k;
            if (remainder < 0) {
                remainder += k;
            }
            remainderCount[remainder]++;
        }

        if (remainderCount[0] % 2 != 0) {
            return false;
        }

        for (int i = 1; i <= k / 2; i++) {
            if (remainderCount[i] != remainderCount[k - i]) {
                return false;
            }
        }

        return true;

    }
}



//                System.out.println("i: "+i+" middle: "+middle);
//                        System.out.println("i: "+e+" middle: "+middle);
//        Map<Integer,Integer> maps = new HashMap<>();
//        int e = arr.length - 1;
//        int middle = arr.length/2;
//        int sum = 0;
//        if (arr.length>1) {
//            for (int i = 0; i < arr.length; i++) {
//                int start = arr[i];
//                int end = arr[e];
//                if (i <= middle) {
//                    while (e >= middle) {
//                        sum += end;
//                        maps.put(start, end);
//                        break;
//                    }
//                }
//                e--;
//            }
//        }else {
//            return false;
//        }
//        System.out.println(maps);
//        boolean isDivisibe = sum%k == 0 ;
//        System.out.println(sum%k);
//        return isDivisibe;
//    }



//        // Step 1: Create a frequency map for remainders when elements are divided by k
//        Map<Integer, Integer> remainderMap = new HashMap<>();
//
//        // Step 2: Populate the map with frequencies of remainders
//        for (int num : arr) {
//            int remainder = num % k;
//            remainderMap.put(remainder, remainderMap.getOrDefault(remainder, 0) + 1);
//        }
//        System.out.println(remainderMap);
//        // Step 3: Check conditions for pairing
//        for (int num : arr) {
//            int remainder = num % k;
////            System.out.println("remainders: "+remainder);
//            // Case 1: If remainder is 0, there must be an even count of such numbers
//            if (remainder == 0) {
//                if (remainderMap.get(remainder) % 2 != 0) {
//                    return false;
//                }
//                System.out.println(remainderMap.get(remainder));
//                System.out.println(remainderMap);
//            }
//            // Case 2: For other remainders, count(remainder) should match count(k - remainder)
//            else {
//                int complement = k - remainder;
//                System.out.println("complement: "+complement+" remainder: "+remainder);
//                if (remainderMap.get(remainder) != remainderMap.getOrDefault(complement, 0)) {
//                    return false;
//                }
//            }
//        }
//            System.out.println(remainderMap);
//
//        // If all conditions are met, return true
//        return true;
