import java.util.Scanner;
public class stringpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String input = sc.nextLine();

        String reversed = ""; //empty string intialize step;
        int length = input.length(); //just like arr.length() ;
        for (int i = length - 1; i >= 0; i--) { //reversing
            reversed = reversed + input.charAt(i); 
        }
        if (input.equals(reversed)) {
            System.out.println("The given string is Palindrome");
        } else {
            System.out.println("The given string is not Palindrome");
        }
    }
}
 
