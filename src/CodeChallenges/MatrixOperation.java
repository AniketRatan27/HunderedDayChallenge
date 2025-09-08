package CodeChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MatrixOperation {
    Scanner sc = new Scanner (System.in);
    public void sumOfSecondLargestFromBothMatrix(){
      System.out.print ("Enter size of array : ");
    int arrsize = sc.nextInt ();
    int[] main = new int[arrsize];
    ArrayList < Integer > even = new ArrayList<Integer>();
    ArrayList < Integer > odd = new  ArrayList<Integer>();
      System.out.println("Enter"+arrsize+"Elements");
    for (int i = 0; i < arrsize; i++)
        main[i] = sc.nextInt ();

    for (int i = 0; i < arrsize; i++) {
        if (i % 2 == 0)
            even.add (main[i]);
        else
            odd.add (main[i]);
    }
    Collections.sort (even);
    Collections.sort (odd);
    System.out.println ("Sorted even array ");

    for (int e:even)
      System.out.print (e + " ");
    System.out.println ();
      System.out.println ("sorted odd array ");

    for (int e:odd)
            System.out.print (e + " ");
    System.out.println ();

    int evensec = even.get (even.size () - 2);
    int oddsec = odd.get (odd.size () - 2);

    System.out.println ("Second Largest Element in Even List is:" + evensec);
    System.out.println ("Second Largest Element in Odd List is:" + oddsec);
    System.out.println ("Sum Of Second Largest Element Of Odd and Even List:" +(evensec + oddsec));
    }
}
