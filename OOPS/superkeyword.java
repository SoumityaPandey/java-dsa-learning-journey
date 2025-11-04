class base {
public base (){
System.out.println("base constructor");
}                                                     //overloaded constructor 
public base (int x ){
System.out.println("overloaded base constructor of value :" + x );
}
}
class derived extends base { 
public derived (){ 
     super(9); 
System.out.println("derived class constructor");
}
}
public class superkeyword {
   public static void main(String[] args) {
    derived x = new derived ();
   } 
}
