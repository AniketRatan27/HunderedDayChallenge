package CodeChallenges;


import java.util.HashMap;
import java.util.Map;

public class DuplicatesArrayElement {
    public void duplicateElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 0) {
                map.put(arr[i], count + 1); // Add 1 to count to include the current element itself
            }
        }

        System.out.println("Duplicate elements and their counts: " + map);
    }
}
