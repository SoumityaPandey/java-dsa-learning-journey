import java.util.Arrays;
import java.util.Scanner;
public class stringorder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to sort: ");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String sortedText = new String(arr);
        System.out.println("Sorted string: " + sortedText);
    }
 
}
