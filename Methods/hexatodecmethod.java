import java.util.Scanner;
public class hexatodecmethod {
    static String convert(String str ){
        int num = Integer.parseInt(str , 16);
        return Integer.toString(num); //coverting int to string
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
      String x =  convert(str);
      System.out.println(x);
        
    }
}
/*import java.util.Scanner;

public class HexToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hex = sc.nextLine();

        // Convert hexadecimal to decimal using built-in method
        int decimal = Integer.parseInt(hex, 16);

        System.out.println("Decimal equivalent: " + decimal);

        sc.close();
    }
}
 */