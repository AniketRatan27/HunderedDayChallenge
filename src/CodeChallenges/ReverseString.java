package CodeChallenges;

import java.util.Stack;

public class ReverseString {
    public String reverse(String name){
        StringBuilder reversedName = new StringBuilder();

        for (int i = name.length() - 1 ; i >= 0; i--) {
            reversedName.append(name.charAt(i));
        }
        return reversedName.toString();
    }
}










//        Stack<Character> stack = new Stack<>();
//
//        for (char str : name.toCharArray()){
//            stack.push(str);
//        }
//
//        StringBuilder reversedName = new StringBuilder();
//        while (!stack.isEmpty()){
//            reversedName.append(stack.pop());
//        }
//        return reversedName.toString();
