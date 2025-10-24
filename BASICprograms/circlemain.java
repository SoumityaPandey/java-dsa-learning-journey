import java.util.Scanner;

public class circlemain {
    public static double calculateArea(double r) {
        return Math.PI * r * r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius: ");
        double r = sc.nextDouble(); 
        double area = calculateArea(r); 
        System.out.println(area);
        sc.close();
    }
}

