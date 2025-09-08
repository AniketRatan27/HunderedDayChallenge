package CodeChallenges;

import java.util.ArrayList;
import java.util.List;

public class FactorailOfANumber {

    public int factorial(int n){
        if (n == 0){
            return 1;
        }
        System.out.println(n);
        return n * factorial(n - 1);
    }
}
