public class swapmethod {
    static int swap(int a , int b ){
    int temp = a ;
    a = b ;
    b = temp ; 
    
System.out.println("swap value " + a + " " + b );

return 0 ;


    }
    public static void main(String[] args) {
        int a = 5 ;
        int b = 10 ; 
        int c = swap(a , b )
    }
    
}
