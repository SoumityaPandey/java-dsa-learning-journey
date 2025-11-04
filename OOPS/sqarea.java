//create a class square with a method to initialize its side ,calc. area and perimeter .
class square{
int side ; 
int area ; 
int perimeter ; 
public void getside(){
    System.out.println(side);
}
public int getarea(){
return side*side ;
}
public int getperimeter(){
    return 4*side;
}
}
public class sqarea {
    public static void main(String[] args) {
        square ab = new square();
        ab.side = 4 ; 
        ab.getside();
        System.out.println(ab.getarea());
        System.out.println(ab.getperimeter());
    }   
}
