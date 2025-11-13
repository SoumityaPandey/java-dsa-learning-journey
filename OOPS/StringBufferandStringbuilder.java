public class StringBufferandStringbuilder {
    public static void main(String[] args) {
        StringBuffer sc = new StringBuffer("Soumitya"); //String builder is also same 
        sc.append(" Pandey");                           // The key difference is String buffer is thread safe while the other is not .
        sc.insert(0, "Hey i am ");
        sc.deleteCharAt(4);
        System.out.println(sc);

    }
}
