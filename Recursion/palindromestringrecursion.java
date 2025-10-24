//String is a palindrome or not using recursion :
import java.util.Scanner;
public class palindromestringrecursion {
    static boolean ispalindrome(String str , int left , int right ){
    if(left >= right){
        return true ;
    }
    if(str.charAt(left) != str.charAt(right)){
        return false ;
    }
    return ispalindrome(str , left +1 , right -1 );

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    String clear = input.replaceAll("[^A-Za-z0-9]","").toLowerCase();    /*replaceAll finds all characters that match the regex.Since we used [^A-Za-z0-9], it finds all non-alphanumeric characters.    Replacing them with "" (empty string) means removing them.*/
    
    if(ispalindrome(clear , 0 , clear.length() - 1 )){
        System.out.println("It is a palindrome");
    }
    else{
        System.out.println("It is not a palindrome");
    }
        }
    }
