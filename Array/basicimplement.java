/*Write a Java program to take 5 integers as input, store them in an array, create a copy of the array, 
and display both the original and copied arrays.  */

//package Array;
import java.util.Scanner;
public class basicimplement {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] arr = new int[5];
        for(int i = 0 ; i < 5 ; i++){
        arr[i] = sc.nextInt();
        }
        System.out.println("creating copy of array:");
        int [] brr = new int[5];
        for(int i = 0 ; i < 5 ; i++){
        brr[i]=arr[i];
        }
        for(int i = 0 ; i < 5 ; i++){
        System.out.println(arr[i]);
        }
         for(int i = 0 ; i < 5 ; i++){
        System.out.println(brr[i]);
        }
    }
}
