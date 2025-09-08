package CodeChallenges;

import java.util.Scanner;


public class BackspaceStringCompare {
    public String checkLastElement(String str1,String str2){
        StringBuilder result1 = new StringBuilder();
        StringBuilder result2 = new StringBuilder();

        int MaxLength = Math.max(str1.length(),str2.length());

        for (int i = 0; i < MaxLength; i++) {
            if (i<str1.length()){
                char ch1 = str1.charAt(i);
                if (ch1 == '#'){
                    if (result1.length()>0){
                        result1.deleteCharAt(result1.length() - 1);
                    }
                }else {
                    result1.append(ch1);
                }
            }
            if (i<str2.length()){
                char ch2 = str2.charAt(i);
                if (ch2 == '#'){
                    if (result2.length()>0){
                        result2.deleteCharAt(result2.length() - 1);
                    }
                }else {
                    result2.append(ch2);
                }
            }
        }
        return result1.toString().equals(result2.toString()) ? "YES" : "NO";
    }
}

// NOTE : IN this problem the # is to delete the lastItem (b)  from  the (ab#c) string so that we get proper string of both the users(BOB,Alice)
// a is appended();
// b is appended();
// # - if this comes then remove previous element or the last element that was added i:e b
// b is removed;
// c is appended();
// Ended result is ac
//similarly do for string2
// then compare the both strings and check whether they match ,if matched then return "YES" or "NO"






//  My Solution FAILED for this problem
/*  char indexChar1 = ' ';
    char indexChar2 = ' ';

        for (Character ch1 : str1.toCharArray()){
                if (str1.length() == 1){
                indexChar1 = str1.charAt(0);
                } else if (ch1 == '#') {
                int index = str1.indexOf(ch1);
                indexChar1 = str1.charAt(index+1);
                }
                }
                for (Character ch2 : str2.toCharArray()){
                if (str2.length() == 1){
                indexChar2 = str2.charAt(0);
                } else if (ch2 == '#') {
                int index = str2.indexOf(ch2);
                indexChar2 = str2.charAt(index+1);
                }
                }

                if (indexChar1 == indexChar2){
                return "YES";
                }
                return "NO";
*/