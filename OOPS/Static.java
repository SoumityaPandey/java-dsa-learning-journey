class Employee{
static int id ;//static variable
String name ; 
public void printdetails() {
    System.out.println(id);
    System.out.println(name);
}
public static void detail(Employee bc){ //static method 
    System.out.println(bc.id);
}
}

public class Static {
    public static void main(String[] args) {

        Employee ab = new Employee();
        Employee.id = 12 ;
        ab.name = "SOUMITYA";
        ab.printdetails();
        Employee bc = new Employee();
       // Employee.id = 15 ;
        bc.name = "PANDEY ";
        Employee.detail(bc);

    }
}