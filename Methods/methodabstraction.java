/*Write a Java program to simulate a basic calculator using method abstraction. Use separate methods for add(), subtract(), multiply(), and divide()
 and call them step-by-step from the main() method. */

import java.util.Scanner ;
public class methodabstraction {
    static double add(double a, double b){ 
        return a + b;         //thats method abstraction hiding the internal details.. kaise add hua kch ni direct return kr diya add ki value ....
    }
    static double subtract(double a, double b){
         return a - b;
         }
    static double multiply(double a, double b){ 
        return a * b;
     }
    static double divide(double a, double b)  { 
        return (b == 0) ? Double.NaN : a / b;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println(add(num1, num2));   //here too , method abstraction direct sout and then uske and return value print ho jayegi...
        System.out.println(subtract(num1, num2));
        System.out.println(multiply(num1, num2));
        System.out.println(divide(num1, num2));
    }
}