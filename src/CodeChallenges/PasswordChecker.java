package CodeChallenges;

public class PasswordChecker {


    public int isValidPassword(String str){
    boolean hasDigit = false;
    boolean hasCapital = false;
    boolean hasSpecialCharacter = false;
    boolean hasSpaceOrSlach = false;
        if(str == null || str.length()<4)return 0;

        for (char checkChar: str.toCharArray()) {
            if(Character.isDigit(checkChar)) hasDigit = true;
            else if (Character.isUpperCase(checkChar)) {
                hasCapital = true;
            } else if (isHasSpaceOrSlach(checkChar)) {
                hasSpaceOrSlach = true;
            }
            else {
                hasSpecialCharacter = !Character.isLetterOrDigit(checkChar) && !Character.isWhitespace(checkChar);
            }
        }
        return (hasDigit && hasCapital && !hasSpaceOrSlach && hasSpecialCharacter &&!Character.isDigit(str.charAt(0))) ? 1 : 0;
    }
    private boolean isHasSpaceOrSlach(char c){
        if (c == ' '||c=='/')return true;
        return false;
    }
}
