package oefeningen.oefening8;

import java.util.Scanner;

public class LiftApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lift lift = new Lift();
        lift.setAantalVerdiepen(10);
        lift.setMaxPersonen(5);

        System.out.println("""
                Maak uw keuze
                1. Ga naar een verdieping
                2. Betreed de lift
                3. Verlaat de lift
                4. Stoppen""");
        int keuze = sc.nextInt();
        while (keuze != 4) {
            if (keuze == 1) {
                System.out.println("Kies een verdieping: ");
                int verdieping = sc.nextInt();
                System.out.println(verdieping);
                lift.gaNaar(verdieping);
            } else if (keuze == 2) {
                System.out.println("Aantal personen: ");
                int personen = sc.nextInt();
                lift.betreed(personen);
            } else if (keuze == 3) {
                System.out.println("Aantal personen: ");
                int personen = sc.nextInt();
                lift.verlaat(personen);
            }

            System.out.println("""
                Maak uw keuze\s
                1. Ga naar een verdieping\s
                2. Betreed de lift\s
                3. Verlaat de lift\s
                4. Stoppen""");
            keuze = sc.nextInt();
        }
    }

}
