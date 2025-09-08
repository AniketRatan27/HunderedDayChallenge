package CodeChallenges;

import java.util.Stack;

public class ReverseWordsOfString {
    public String reverseString(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            stack.push(s.charAt(i));
        }
        return stack.toString();
    }

    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder stringBuilder = new StringBuilder();
        String[] str = s.split("\\s+");
        for (int i = str.length - 1; i >= 0; i--) {
            stringBuilder.append(str[i]);
            if (i != 0) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}
