//	Write a Java program to accept two integers and return true if either is 15 or if their sum or difference is 15.
import java.util.Scanner ; 
public class logicaloperatoruse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x==15 || y==15 || x+y==15 || x-y==15){
          System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    
}
