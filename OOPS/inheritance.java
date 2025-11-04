class base {
int x ; 
public int getx(){
    return x ;
}
public void setx(int x ){
    this.x = x ;
}
}
class derived extends base {
int y ; 
public int gety(){
    return y ;
}
public void sety(int y ){
    this.y = y ;
}
}
public class inheritance {
    public static void main(String[] args) {
        base b = new base ();
        b.setx(101);
        System.out.println(b.getx());

        derived d = new derived();
         d.sety(201);
        System.out.println(d.gety());
    }
}
