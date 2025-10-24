/*Create a method that takes a two-dimensional array and returns the sum of all its elements.  */
import java.util.*;
public class twoDarraysum {
    static int arraysum(int [][] arr){
        int sum = 0 ;
        for(int i = 0 ; i< 2 ; i++){
        for(int j = 0 ; j< 2 ; j++){
         sum = sum + arr[i][j];
    }
}
    return sum ;
}
    
    public static void main (String[] args ){
    Scanner sc = new Scanner (System.in);
    int [] [] arr = new int [2][2];
    for(int i = 0 ; i< 2 ; i++){
    for(int j = 0 ; j< 2 ; j++){
    arr[i][j] = sc.nextInt();
     }
    }
    int total = arraysum(arr);
    System.out.print(total);
    }
}
