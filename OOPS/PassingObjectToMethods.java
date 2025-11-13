class Employee {
String name;
public Employee(String n ){ //to method
name = n ;
}
public void detail(Employee sc){
System.out.println(sc.name);
}
}
public class PassingObjectToMethods {
public static void main(String[] args) {
Employee sc = new Employee("Pandey"); //passing object 
sc.detail(sc);
}
}
