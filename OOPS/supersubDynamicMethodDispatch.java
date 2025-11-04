class base {   //SUPER
    public void meth1(){
        System.out.println("meth1 of class base implemented");
    }
    public void meth2(){
       System.out.println("meth2 of class base implemented");
    }
}
class derived extends base {  //SUB
@Override
public void meth1(){
   System.out.println("meth 1 of class derived implemented");
}
public void meth3(){
    System.out.println("meth 3 of class derived implemented");
}
}
public class supersubDynamicMethodDispatch {
    public static void main(String[] args) {
    base x = new derived();
    x.meth1();  //overide one will implement
    x.meth2();
   // x.meth3(); will give error     
    }
}
