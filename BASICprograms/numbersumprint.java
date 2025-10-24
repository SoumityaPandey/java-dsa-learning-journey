//	Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer
import java.util.Scanner ; 
public class numbersumprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0 ; 
        while(n>0){
        sum = sum + n%10 ;
        n = n/10;
        }
        System.out.println(sum);
        
    }
    
}
