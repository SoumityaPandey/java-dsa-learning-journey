  import java.util.Scanner;
public class convertertypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base of the number:");
        System.out.println("1. Binary");
        System.out.println("2. Octal");
        System.out.println("3. Decimal");
        System.out.println("4. Hexadecimal");
        System.out.print("Choose (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter the number: ");
        String input = sc.next();

        int decimal = 0;

        // Convert input to decimal first
        switch (choice) {
            case 1: // Binary
                decimal = Integer.parseInt(input, 2);
                break;
            case 2: // Octal
                decimal = Integer.parseInt(input, 8);
                break;
            case 3: // Decimal
                decimal = Integer.parseInt(input, 10);
                break;
            case 4: // Hexadecimal
                decimal = Integer.parseInt(input, 16);
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        // Print in all bases
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + Integer.toBinaryString(decimal));
        System.out.println("Octal: " + Integer.toOctalString(decimal));
        System.out.println("Hexadecimal: " + Integer.toHexString(decimal).toUpperCase());

        sc.close();
    }
}


