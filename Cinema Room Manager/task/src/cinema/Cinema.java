package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of rows:");
            int nbrRow = scanner.nextInt();
            System.out.println("Enter the number of seats in each row:");
            int nbrSeat = scanner.nextInt();
            if (nbrRow * nbrSeat <= 60) {
                System.out.println("Total income:");
                System.out.println("$" + nbrRow * nbrSeat * 10);
            } else {
                if (nbrRow % 2 == 0) {
                    System.out.println("Total income:");
                    System.out.println("$" + (nbrRow / 2) * nbrSeat * 18);
                } else {
                    int nbrRowSup = nbrRow / 2;
                    int nbrRowInf = nbrRow - nbrRowSup;
                    System.out.println("Total income:");
                    System.out.println("$" + nbrSeat * (nbrRowSup * 10 + nbrRowInf * 8));
                }
            }
        }
    }
}