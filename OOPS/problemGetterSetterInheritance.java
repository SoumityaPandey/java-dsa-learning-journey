class rectangle {
int length;
int width;
public int getLength(){
    return length ; 
}
public int getWidth(){
    return width ; 
}
public void setLength(int l ){
    this.length = l ; 
}
public void setWidth(int w ){
    this.width = w ; 
}
public int getarea(){
    return length * width ;
}
}
class cuboid extends rectangle {
int height ;
public int getHeight(){
    return height ;
}
public void setHeight(int h){
this.height = h ;
}
public int getArea(){
    return 2*(length * width + width * height + length * height );
}
}
public class problemGetterSetterInheritance {
    public static void main(String[] args) {
        rectangle x = new rectangle();
        x.setLength(5);
        x.setWidth(10);
        System.out.println(x.getarea());
        
        cuboid y = new cuboid();
        y.setHeight(15);
        y.setLength(5);
        y.setWidth(10);
        System.out.println(y.getArea());
    }
}
