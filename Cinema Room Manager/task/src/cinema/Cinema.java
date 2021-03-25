package cinema;

public class Cinema {

    public static void main(String[] args) {
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int i = 1; i < 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i < 8; i++) {
            System.out.print(i);
            for (int j = 0; j < 8; j++) {
                System.out.print(" S");
            }
        }
    }
}