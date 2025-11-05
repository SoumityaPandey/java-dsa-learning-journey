import java.io.*;
import java.util.*;

public class firstprogramString {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Sum the lengths of A and B  */

        int c = A.length();
        int d = B.length();
        System.out.println(c + d);

        /*Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?). */

       int result = A.compareTo(B);
      // System.out.println(result);
      if(result > 0){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }

      /*Capitalize the first letter in A and B and print them on a single line, separated by a space. */

      String x = A.substring(0, 1).toUpperCase() + A.substring(1);
      String y = B.substring(0, 1).toUpperCase() + B.substring(1);
      System.out.println(x  + "  " + y);

    }
    }

 /*If string a is lexicographically larger than b, it means a comes after b in the dictionary. If string a comes before b
 in the dictionary, it is lexicographically smaller.

Larger: "zebra" > "apple" (comes after)

Smaller: "apple" < "zebra" (comes before)
    
    
-------------------------------------------------------------------------------------------------
    
 When you call a.compareTo(b): ----

It returns a negative number (< 0) if a comes before b.

It returns zero (== 0) if a and b are equal.

It returns a positive number (> 0) if a comes after b. */