/*Write a Java program that demonstrates method overloading by creating multiple add() methods that can add two integers,
 two doubles, and three integers. Also, demonstrate local and global variable scopes inside the class. */

 public class methodoverloading {
   static int globalVar = 100 ;
   static void add (int x , int y ){
        int result = x + y ;
    System.out.println(result);
    }
     static void add (double x , double y ){
        double result = x + y ;
    System.out.println(result);
    }
    static void add (int x , int y , int z  ){
        int result = x + y + z ;
    System.out.println(result);
    }
    static void showvariablescope(){
     int localvar = 50 ; 
     System.out.println(globalVar);
     System.out.println(localvar);
    }
   public static void main(String[] args) {
    add(2,4);
    add(2.5,4.5);
    add(2,4,5);
    showvariablescope();
   } 
}