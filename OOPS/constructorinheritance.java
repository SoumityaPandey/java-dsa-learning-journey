class base {
    public base() {
   System.out.println("base class - Constructor ");
    }

}
class derived extends base {
    public derived(){
    System.out.println("derived class - Constructor ");
    }
}
public class constructorinheritance {
    public static void main(String[] args) {
    derived d = new derived ();     
    }
}
