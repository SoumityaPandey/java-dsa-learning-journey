/*Write a Java program to calculate the factorial of a number using recursion.  */

import java.util.Scanner ; 
//package Recursion;
public class factorial {
    static int fact (int n){
         if (n == 0 || n == 1) {
        return 1;
         }
       int a = n * (fact(n-1));
       return a ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int x = fact(n);
        System.out.println(x);

    }
    
}
