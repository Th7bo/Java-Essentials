package extraoefeningen.oefening1;

import java.util.Scanner;

public class GetalApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geef een oneven getal in: ");
        int getal = scan.nextInt();
        while (getal < 5 || getal > 49 || getal % 2 == 0) {
            System.out.println("Geef een oneven getal in (5-49): ");
            getal = scan.nextInt();
        }

        for (int i = 0; i < getal; i++) {
            for (int j = 0; j < getal; j++) {
                if (j == i || j == getal - 1 - i) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

}
