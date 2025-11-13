class F {
  int i;
  void imethod() { 
    System.out.println("hello");
  }

  static String s;
  static void smethod() { 
    System.out.println("hello1");
  }
} 
public class InstanceAndStatic {
public static void main(String[] args) {
  F f = new F ();
  F.smethod(); //Static refer to the class
  f.imethod(); //this refer to instance of the class 
  
}

}
