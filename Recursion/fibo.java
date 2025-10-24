/*Write a recursive program to generate the first N numbers in the Fibonacci sequence. */

import java.util.Scanner ; 
//package Recursion;

public class fibo {
        static int Fibo(int n){
         if (n == 1 || n == 2) {
        return 1;
         }
       int a = Fibo(n-1) + Fibo(n-2);
       return a ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int x = Fibo(n);
        System.out.println(x);

    }
    
}
