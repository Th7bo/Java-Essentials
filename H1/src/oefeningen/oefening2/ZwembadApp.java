package oefeningen.oefening2;

import java.util.Scanner;

public class ZwembadApp {

    public static void main(String[] args) {
        Zwembad zwembad = new Zwembad();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef de breedte van het zwembad: ");
        double breedte = scanner.nextDouble();
        System.out.print("Geef de lengte van het zwembad: ");
        double lengte = scanner.nextDouble();
        System.out.print("Geef de diepte van het zwembad: ");
        double diepte = scanner.nextDouble();

        zwembad.setBreedte(breedte);
        zwembad.setLengte(lengte);
        zwembad.setDiepte(diepte);

        System.out.printf("Liter water: %.0f %n", zwembad.getVolumeWater());
        System.out.printf("Liter ontsmettingsmiddel: %.0f %n", zwembad.getVolumeOntsmettingsmiddel());
    }

}
