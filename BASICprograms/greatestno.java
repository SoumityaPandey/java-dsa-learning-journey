/*Write a Java program that takes three numbers from the user and prints the greatest number.*/

//package BASICprograms;
import java.util.Scanner ;
public class greatestno {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

if(a>=b && a>=c){
System.out.println(a);
}
else if(b>=a && b>=c){
System.out.println(b);
}
else{
System.out.println(c);
}
} 
}

//different approach -- use Math.max 
/*import java.util.Scanner;
public class GreatestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
*/
