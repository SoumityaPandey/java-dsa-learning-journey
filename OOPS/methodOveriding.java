class base {
    public void meth1(){
    System.out.println("meth 1 of class base implemented");
    }
}
class derived extends base {
    @Override
    public void meth1(){
    System.out.println("meth 1 of class derived implemented");
    }
   public void meth2(){
   System.out.println("meth2 of class derived implemented");
}
}
public class methodOveriding {
    public static void main(String[] args) {
      derived x = new derived ();  
       x.meth1();
        x.meth2();
    }
}
