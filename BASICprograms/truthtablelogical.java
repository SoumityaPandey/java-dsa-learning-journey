public class truthtablelogical {
    public static void main(String[] args) {
        boolean A, B;

        System.out.println("A\tB\tA&&B\tA||B\tA^B\t!A");

        // case 1
        A = true; B = true;
        System.out.println(A + "\t" + B + "\t" + (A&&B) + "\t" + (A||B) + "\t" + (A^B) + "\t" + (!A));

        // case 2
        A = true; B = false;
        System.out.println(A + "\t" + B + "\t" + (A&&B) + "\t" + (A||B) + "\t" + (A^B) + "\t" + (!A));

        // case 3
        A = false; B = true;
        System.out.println(A + "\t" + B + "\t" + (A&&B) + "\t" + (A||B) + "\t" + (A^B) + "\t" + (!A));

        // case 4
        A = false; B = false;
        System.out.println(A + "\t" + B + "\t" + (A&&B) + "\t" + (A||B) + "\t" + (A^B) + "\t" + (!A));
    }
}


