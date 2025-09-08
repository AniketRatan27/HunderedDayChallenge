package CodeChallenges;

public class InterviewQuestion {
    public int countNumberOfSpace(String str){
        int count = 0;
        for (char st:str.toCharArray()){
            if (st == ' '){
                count++;
            }
        }
        return count;
    }
}
