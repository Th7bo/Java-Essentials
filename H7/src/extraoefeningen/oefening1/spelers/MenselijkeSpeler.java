package extraoefeningen.oefening1.spelers;

import extraoefeningen.oefening1.Bord;
import extraoefeningen.oefening1.Zet;

import java.util.Scanner;

public class MenselijkeSpeler extends Speler {



    public MenselijkeSpeler(String naam, char teken) {
        super(naam, teken);
    }

    @Override
    public Zet getZet(Bord bord) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef de rij in:");
        int rij = scanner.nextInt();
        System.out.println("Geef de kolom in:");
        int kolom = scanner.nextInt();
        Zet zet = new Zet(super.getTeken(), rij, kolom);
        while (bord.isGeldigeZet(zet)) {
            System.out.println("Ongeldige zet, probeer opnieuw");
            System.out.println("Geef de rij in:");
            rij = scanner.nextInt();
            System.out.println("Geef de kolom in:");
            kolom = scanner.nextInt();
            zet.setKolom(kolom);
            zet.setRij(rij);
        }
        return zet;
    }
}
