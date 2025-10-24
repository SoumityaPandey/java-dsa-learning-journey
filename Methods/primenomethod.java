import java.util.Scanner ;
public class primenomethod {
    static int prime (int n ){
       int temp = 0 ;
        for(int i = 2 ; i<n ; i++){
            if(n%i==0){
                temp = temp + 1 ;

            }
        }
        if(temp>0){
            System.out.println("not prime");
        }
        else {
            System.out.println("prime");
        }
        return 0 ; 
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int x = prime(n);
    }
    
}
