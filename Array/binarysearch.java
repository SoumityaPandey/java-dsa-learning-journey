/*Write a Java program to input an array of integers, sort it, and perform binary search.  **************************************
 */
import java.util.Scanner ;
import java.util.Arrays;
public class binarysearch {
    static int binarysearch(int [] arr , int n , int key ){
    int low = 0 ;
    int high = n-1;

    while(low<=high){
        int mid = (low + high) / 2 ;
    
     if (arr[mid] == key){
    return mid ;
     }
    else if (arr[mid] < key) {
    low = mid + 1 ;
    }
    else {
    high = mid - 1 ;
    }
    }
    return - 1 ;
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n :");
        int n = sc.nextInt();
        System.out.println("enter value of k :");
        int key = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i<n ; i++){
        arr[i] = sc.nextInt();
        }
        //sorting array :
        Arrays.sort(arr);
        System.out.println("sorted array : " + Arrays.toString(arr));

        int result = binarysearch(arr , n , key );

        if(result != -1 ){
            System.out.println("At this index the key founds "+result);
        }
        else {
            System.out.println("key not found");
        } 
    }
}

/* For sorting we can use bubble sort or direct built-in function 


1-] bubble sort
for (int i = 0; i < n - 1; i++) {
    for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
            // swap arr[j] and arr[j+1]
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
    }
}
    2-] built in function ;
    
    import java.util.Arrays ;

    Arrays.sort(arr);
    System.out.print(Arrays.toString(arr));


 */