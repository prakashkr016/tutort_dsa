public class pyramid1 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= (4 - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(num++);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
