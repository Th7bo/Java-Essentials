package oefeningen.oefening5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TshirtApp {

    public static void main(String[] args) {
        Tshirt[][] tshirts = new Tshirt[Kleur.values().length][TShirtSize.values().length];

        for (Kleur kleur : Kleur.values()) {
            for (TShirtSize size : TShirtSize.values()) {
                tshirts[kleur.ordinal()][size.ordinal()] = new Tshirt(size, kleur, 0);
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine();
        while (!name.equalsIgnoreCase("stop")) {
            System.out.println("Borst omtrek: ");
            int borstOmtrek = scanner.nextInt();

            TShirtSize size = Arrays.stream(TShirtSize.values()).sorted().filter(s -> s.getMaxBorstOmtrek() >= borstOmtrek).findFirst().orElse(TShirtSize.extra_extra_extra_large);
            System.out.println("Kleur: ");
            int kleurIndex = scanner.nextInt();
            Kleur kleur = Kleur.values()[kleurIndex];

            tshirts[kleur.ordinal()][size.ordinal()].addAantal(1);

            System.out.println("Name: ");
            scanner.nextLine();
            name = scanner.nextLine();
        }

        System.out.print("\t\t");
        for (TShirtSize size : TShirtSize.values()) {
            System.out.print(size.getKorteNotatie() + "\t");
        }

        System.out.println();
        Tshirt vaaksteTshirt = tshirts[0][0];
        Tshirt minsteTshirt = tshirts[0][0];

        for (Kleur kleur : Kleur.values()) {

            System.out.print(kleur + "\t");
            if (kleur.name().length() < 4) {
                System.out.print("\t");
            }
            for (TShirtSize size : TShirtSize.values()) {
                Tshirt shirt = tshirts[kleur.ordinal()][size.ordinal()];
                if (shirt.getAantal() > vaaksteTshirt.getAantal()) {
                    vaaksteTshirt = shirt;
                } else if (shirt.getAantal() < minsteTshirt.getAantal()) {
                    minsteTshirt = shirt;
                }
                System.out.print(shirt.getAantal() + "\t");
            }
            System.out.println();
        }

        System.out.println("Vaakste tshirt: " + vaaksteTshirt.getKleur() + " " + vaaksteTshirt.getSize().getKorteNotatie());
        System.out.println("Minste tshirt: " + minsteTshirt.getKleur() + " " + minsteTshirt.getSize().getKorteNotatie());
    }

}
