import java.util.Scanner ;
public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number :");
        int x = sc.nextInt();
        int temp = 0 ;
        for(int i = 2 ; i< x ; i++){ //if asked to tell prime no btw 1 to 99 then , for(int i = 2 ; i<=100 ; i++){ 
          if(x%i==0){
            temp = temp + 1 ;
          }
        }
        if(temp > 0){
            System.out.println("not prime ");
        }
        else {
            System.out.println("prime no.");
        }
    }
    
}
