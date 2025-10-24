/*Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer, 
calculate percentage and grade according to given conditions:

If percentage >= 90% : Grade A
If percentage >= 80% : Grade B
If percentage >= 70% : Grade C
If percentage >= 60% : Grade D
If percentage >= 40% : Grade E
If percentage < 40% : Grade F
*/
import java.util.Scanner ; 
public class condition {
    public static void main (String []args){
Scanner sc = new Scanner (System.in);
int a= sc.nextInt();
int b =sc.nextInt();
int c= sc.nextInt();
int d= sc.nextInt();
int e= sc.nextInt();

double p = (a+b+c+d+e)/500.0*100.0;

if(p>=90){
    System.out.println("GRADE A ");
}
else if(p>=80){
    System.out.println("GRADE B ");
}
else if(p>=70){
    System.out.println("GRADE C ");
}
else if(p>=60){
    System.out.println("GRADE D ");
}
else if(p>=40){
    System.out.println("GRADE E ");
}
else if (p<40){
    System.out.println("GRADE F ");
}
    }
}
