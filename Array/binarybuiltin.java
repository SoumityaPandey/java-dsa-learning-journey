//built in fn use of binary search and sorting-------------->

import java.util.Scanner ;
import java.util.Arrays;
public class binarybuiltin {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter value of n :");
        int n = sc.nextInt();
        int key = sc.nextInt();
        int [] arr = new int [n] ;
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        //Built - in Sort function :
        System.out.println("Sorted array :");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        //Built - in Binary Search function :
        System.out.println("Binary Search :");
        int index = Arrays.binarySearch(arr , key );
        System.out.println(index);
    }
}
