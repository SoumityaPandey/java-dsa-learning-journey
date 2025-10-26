public class typecasting {
    public static void main(String[] args) {

        System.out.println(" Widening ");
        int a = 5;
        double b = a; 
        
        System.out.println("int value: " + a);
        System.out.println("double value: " + b);

        System.out.println("Narrowing");
        double x = 5.8;
        int y = (int) x; 
        
        System.out.println("double value: " + x);
        System.out.println("int value: " + y); 
    }
} 

