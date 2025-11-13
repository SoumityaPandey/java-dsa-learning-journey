class base {
 public base() {
    this(22);
   System.out.println("hello 1 ");
 }
 public base (int n ){
    System.out.println("hello  " + n);
 }
}
class derived extends base {
public derived (){
    System.out.println("hello 2 ");
}
public derived (int x ){
   //1 super(10);
   //2 this();               // NOTE :this method execute constructor of same class and super keyword execute constructor of different class .
    System.out.println("hello  " + x );
}
}
public class THISandSUPER {
    public static void main(String[] args) {
   //1     derived d = new derived(5) ;
 //2   derived d = new derived(15) ;
  derived d = new derived() ; 
    }
}
