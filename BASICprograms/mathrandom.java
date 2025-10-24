//implementing math.random with two ways in array:

import java.util.Random;
import java.util.Scanner ;
public class mathrandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter value of n :");
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0 ; i< n ;i++){
            //first way :
        arr[i] = (int) (Math.random() *1000);
        }
        for(int i = 0 ; i< n ;i++){
            System.out.print(arr[i] + " ");
    }
    //second way :
    Random xy = new Random();
    for(int i = 0 ; i< n ;i++){
    arr[i] = xy.nextInt(1000);
    }
    for(int i = 0 ; i< n ;i++){
    System.out.print(arr[i] + " ");
}
}
}