package CodeChallenges;

public class IntegerToRomanNumber {

    private final String[] romanNumerals = {"M","CM","D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    public String integerToRoman(int num){
        if(num == 0){
            return "";
        }
        int i = 0;
        while(i < values.length && num < values[i]){
             i++;
        }
        return romanNumerals[i] + integerToRoman(num - values[i]);
   }
}
