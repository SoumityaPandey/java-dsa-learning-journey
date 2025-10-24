
import java.util.Scanner ;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();
        int reversednumber = 0 ;
        int temp = number ;
        int remainder ;
        while(temp>0){
        remainder = temp % 10 ;
        reversednumber = reversednumber * 10 + remainder ;
        temp = temp / 10 ;
        }
        if(number == reversednumber){
            System.out.println("The given number is Palindrome");
        }
        else {
            System.out.println("The given number is not Palindrome");
        }

    }
    
}
