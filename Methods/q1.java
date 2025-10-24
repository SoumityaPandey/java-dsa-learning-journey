/*. Write a Java program to define a method calculateArea(double radius) that calculates and returns the area of a circle.
 Call this method from the main() method and display the result. 
 */
public class q1 {
 static double calculateArea(double r){
    double area  = Math.PI * r* r ;
    return area ; 
     }
   public static void main(String[] args) {
  double x =  calculateArea(6);
  System.out.println(x);
   }
}
