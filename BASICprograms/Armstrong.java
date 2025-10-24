//Finding whether a number is armstrong or not .....eg - 153 = 1^3+5^3+3^3 = 153 then it is armstrong.
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. which you want to check whether it is armstrong or not ") ;
        int number = sc.nextInt();
        int temp = number ;
        int length = 0 ;         
        while(temp>0){
            temp = temp /10 ;
            length = length+1;
        }
        int temp2 = number ;
        int sum = 0 ;
        while(temp2>0){
         int multiply = 1 ; //// reset for each digit
         int rem = 0 ;////// reset for each digit that's why we are intializing it here .
         rem = temp2%10 ;
         for(int i = 1 ; i <=length ;i++){
         multiply = multiply * rem ;
         }
        sum = sum + multiply;
        temp2 = temp2/10 ; 
        }
        if(number == sum ){
            System.out.println("The given number is Armstrong");
        }
        else{
            System.out.println("The given number is not Armstrong");
        }
        }        
    }
    /*NOTE - integers in Java don’t have a .length() method.
.length() only works on arrays, and .length() or .length()-like methods
 (like .length() in Strings) are for objects, not primitive types like int. */