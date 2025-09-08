package CodeChallenges;

public class LengthOfLastWord {
    public int lastWordLength(String s){
        int length=0;
        s = s.trim();
        for(int i = s.length()-1 ;i>=0 ;i--){
            if(s.charAt(i) == ' '){
                break;
            }
            else length++;
        }
        return length;
    }
    public void trimTheString(String s){
       s = s.trim();
        System.out.println(s);
    }
}
