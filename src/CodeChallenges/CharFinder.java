package CodeChallenges;

import java.util.HashMap;
import java.util.Map;

public class CharFinder {

    public char findFirstNonRepeatingChar(String str){
        var chars = str.toCharArray();
        Map<Character ,Integer> map = new HashMap<>();
        for (char ch : chars){
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch ,count + 1);
            System.out.print(" "+map.get(ch)+" ");
        }
        for (char ch : chars){
            if(map.get(ch) == 1) {
                return ch;
            };
        }
        return Character.MIN_VALUE;
    }
}
