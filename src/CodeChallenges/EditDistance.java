package CodeChallenges;

import java.util.Arrays;

public class EditDistance {
    public void minDistance(char[] word1 ,char[] word2){
       int count = 0;
        for (int i = 0; i < word1.length - 1; i++) {
            for (int j = 0; j <= i; j++) {
                if (word1[i]!= word2[j]){
                    word1[i] = word2[j];
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(word1));
    }
}
