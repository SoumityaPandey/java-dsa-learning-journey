import java.util.*;
import java.text.*;

    public class javacurrencyformatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat chinaNumberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
         NumberFormat franceNumberFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
          NumberFormat usNumberFormat = NumberFormat.getCurrencyInstance(Locale.US);
           NumberFormat IndiaNumberFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

           String china = chinaNumberFormat.format(payment);
           String france = franceNumberFormat.format(payment);
           String us = usNumberFormat.format(payment);
           String india  = IndiaNumberFormat.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}


