package CodeChallenges;

public class AddSpaceToString {
    public String addSpaces(String str) {
        for (char s : str.toCharArray()) {
            System.out.print(s + " ");
        }
        return "";
    }
}
