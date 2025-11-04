class base {
public base (){
System.out.println("base constructor");
}                                                  
public base (int x ){
System.out.println("overloaded base constructor of value :" + x );
}
}
class derived extends base { 
public derived (){ 
System.out.println("derived class constructor");
}
public derived (int x , int y ){
super(x);
System.out.println("overloaded derived class constructor with value"+ y);
}
}
public class superheirarcy {
   public static void main(String[] args) {
    derived x = new derived (5,10);
   } 
}
