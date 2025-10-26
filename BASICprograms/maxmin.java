/*Write a Java program that accepts two integers from the user and prints the sum, the difference, the product, the average,
 the maximum (the largest of the two integers), and the minimum (the smallest of the two integers).*/

import java.util.Scanner ;
public class maxmin {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a + b ;
    System.out.println(sum);
    int diff = a - b ;
    System.out.println(diff);
    int product = a * b ;
    System.out.println(product);
    double avg = a + b / 2 ;
    System.out.println(avg);
    if ( a > b ){
    System.out.println("largest no. is : "+ a);
    }
    else {
    System.out.println("largest no. is : "+ b);   
    }
    if ( a < b ){
    System.out.println("smallest no. is : "+ a);
    }
    else {
    System.out.println("smallest no. is : "+ b);   
    }
    }
    }
