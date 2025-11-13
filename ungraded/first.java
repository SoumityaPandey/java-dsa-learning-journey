public class first {
    public static double calculateArea(double radius) {
        double area = Math.PI * radius * radius;  
        return area;
    }
    public static void main(String[] args) {
        double radius = 5.0; 
        double area = calculateArea(radius);
        System.out.println(area);
    }
}


