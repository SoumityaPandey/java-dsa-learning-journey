class employee {
int id ; 
String name ;

public employee(){ 
    id = 101 ;
    name = "abc" ;
}
public int getId(){
    return id ;
}
public String getName(){
    return name ;
}
public void setId(int i){
id = i ;
}
public void setName(String n){
    name = n ;
}
}
public class constructor {
    public static void main(String[] args) {
        employee x = new employee();
        System.out.println(x.getId());
        System.out.println(x.getName());
        
    }
}
