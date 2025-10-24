 import java.util.Arrays;
import java.util.Scanner;
public class stringorder {
    public static void main(String[] args) {

        // 1. Set up a Scanner to get input from the user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to sort: ");

        // 2. Read the user's input string.
        String str = sc.nextLine();

        // 3. Convert the string into a character array.
        char[] arr = str.toCharArray();

        // 4. Sort the character array alphabetically.
        Arrays.sort(arr);

        // 5. Convert the sorted character array back into a string.
        String sortedText = new String(arr);

        // 6. Print the final sorted string.
        System.out.println("Sorted string: " + sortedText);
    }
}
