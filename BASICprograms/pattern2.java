public class pattern2 {
    public static void main(String[] args) {
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
        for (int space = 1; space <= rows - i; space++) {
         System.out.print(" ");
            }
        for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
            }
        System.out.println();
        }
    }
}