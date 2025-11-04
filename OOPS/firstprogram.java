//package OOPS;
class Employee{
int id ;
String name ; 
public void printdetails() {
    System.out.println(id);
    System.out.println(name);
}
}
public class firstprogram {
    public static void main(String[] args) {
        Employee ab = new Employee();
        ab.id = 12 ;
        ab.name = "SOUMITYA PANDEY ";
       // System.out.println(ab.id);
       // System.out.println(ab.name);
        ab.printdetails();
    }
}
