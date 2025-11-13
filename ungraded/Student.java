public class Student {
    private String name;
    private int rollNumber;
    private double cgpa;
    public Student(String name, int rollNumber, double cgpa) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.cgpa = cgpa;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public double getCgpa() {
        return cgpa;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    public void displayDetails() {
        System.out.println(name);
        System.out.println( rollNumber);
        System.out.println( cgpa);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Soumitya Pandey", 101, 8.9);
        s1.displayDetails();
        System.out.println(s1.getName());
        System.out.println(s1.getRollNumber());
        System.out.println(s1.getCgpa());
    }
}
