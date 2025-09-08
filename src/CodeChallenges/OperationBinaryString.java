package CodeChallenges;

public class OperationBinaryString {

    public int evaluateStringForBinary(String str){
        if(str == null) return -1;

        int result = Character.getNumericValue(str.charAt(0));

        for(int i = 1 ; i<str.length() ;i+=2){
            char operation = str.charAt(i);
            char nextDigit = str.charAt(i+1);

            System.out.println(operation+" "+i);
            System.out.println(nextDigit+" "+(i+1));

            switch (operation){
                case 'A':
                    result &= Character.getNumericValue(nextDigit);
                    break;
                case 'B':
                    result |= Character.getNumericValue(nextDigit);
                    break;
                case 'C':
                    result ^= Character.getNumericValue(nextDigit);
                    break;
                default:
                    return -1;

            }
        }
        return result;
    }
}
