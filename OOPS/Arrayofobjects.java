class Employee{
    String name ;
    int id ;
}                                                                             
public class Arrayofobjects {
    public static void main(String[] args) {
        Employee s1 = new Employee();
        s1.id = 12 ;
        s1.name = "Soumitya" ;

         Employee s2 = new Employee();
        s2.id = 14 ;
        s2.name = "Rahul" ;

         Employee s3 = new Employee();
        s3.id = 16 ;
        s3.name = "Satish" ;

        Employee arr [] = new Employee[3];
        for(int i = 0 ; i< 3 ; i++){
            arr[0] = s1;
            arr[1] =s2 ;
            arr[2] =s3 ;
        
        System.out.println(arr[i].id + " : " + arr[i].name);
        }
        }
        
    }

