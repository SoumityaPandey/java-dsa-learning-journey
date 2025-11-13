import java.util.*;
public class random {
    public static void main(String[] args) {
    Random sc = new Random(2);
    for(int i = 0 ; i< 10 ; i++){
        System.out.println(sc.nextInt(1000) + " ");
    }
    }
}

