  import java.util.Scanner;
public class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter:");
        char ch = sc.next().charAt(0);
        String str = "aeiouAEIOU";
        boolean b = false ;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                b = true ;
                break ;
            }
        }
        if(b){
      System.out.println(ch + " is a vowel");
            }
         else {
                System.out.print(ch + " is a constant");
            }
        }
    
    }

    
