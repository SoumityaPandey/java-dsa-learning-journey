/*Write a Java program to define a method reverseArray(int[] arr) that takes an array 
and returns the reversed array. Display the reversed array in the main() method. */
import java.util.Scanner ;
public class arraymethod {
    static int [] reverseArray( int[] arr){
      int n = arr.length;
      int [] rev = new int[n];
      for(int i = 0 ; i < n ;i++){
      rev[i] = arr[n-1-i];
      }
      return rev ;
        }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int [n];
    for(int i = 0 ; i < n ;i++){
    arr[i] = sc.nextInt();
    }
    int [] reversed = reverseArray(arr);  //caution!!
    for(int i = 0 ; i < n ;i++){
    System.out.print(reversed[i]);
    }
  }  
}
//another method : EASY
/*import java.util.Scanner;
public class ArrayMethod {
    static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
        System.out.println("Reversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
 */