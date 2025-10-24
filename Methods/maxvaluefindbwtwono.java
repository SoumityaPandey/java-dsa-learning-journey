public class maxvaluefindbwtwono {
    static int large(int a , int b ){
     if(a>b){
        return a ;
     }
     else {
        return b ;
     }
    }
    public static void main(String[] args) {
        int a = 5 ;
        int b = 3 ; 
        int c = large(a,b);
        System.out.println(c);
    }
}
