public class WrapperClass {
    public static void main(String[] args) {
        int num1 = 12;
        Integer num2 = num1 ;         //Auto-Boxing ---primitive data stored in object 

        int num3 = num2 ;      //Auto-Unboxing --Fetch the value 


        String x = "22" ;
        int num = Integer.parseInt(x);
        System.out.println(num * 5 );

    }
}
