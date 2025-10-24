/*Write a Java program to input a 3x3 matrix from the user and write a method to 
calculate and return the transpose of the matrix. Display the original and transposed matrix.*/ 

import java.util.Scanner ;
import java.util.Arrays ;
public class transpose3x3 {
 static int [] [] caltranspose(int [][] arr){
    int [] [] transpose = new int[3][3];
    for(int i = 0 ; i <arr.length ; i++ ){
    for(int j = 0 ; j< arr[i].length ; j++){
    transpose[j][i] = arr[i][j];
    }
    }
    return transpose;
 }
   static void printorginal(int [] []arr){
         for(int i = 0 ; i < arr.length ; i++ ){
         for(int j = 0 ; j< arr[i].length ; j++){
         System.out.print(arr[i][j] + "  ");    //not ln 
         } 
         System.out.println();
         }
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] [] arr = new int[3][3];
        for(int i = 0 ; i <arr.length ; i++ ){
        for(int j = 0 ; j< arr[i].length ; j++){
        arr[i][j] = sc.nextInt();
        }
    }
        printorginal(arr);
        int [] [] brr = caltranspose(arr);
        for(int i = 0 ; i <arr.length ; i++ ){
        for(int j = 0 ; j< arr[i].length ; j++){
        System.out.print(brr[i][j] + "  ");    //caution
        }
        System.out.println();
        } 
    }  
}