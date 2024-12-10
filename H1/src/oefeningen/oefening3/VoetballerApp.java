package oefeningen.oefening3;

import java.util.Scanner;

public class VoetballerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Naam: ");
        String naam = sc.nextLine();
        while (!naam.equals("stop")) {
            Voetballer voetballer = new Voetballer();
            voetballer.setNaam(naam);
            System.out.print("Leeftijd: ");
            voetballer.setLeeftijd(sc.nextInt());
            System.out.print("Positie: ");
            voetballer.setPositie(sc.next());
            System.out.print("Beoordeling: ");
            voetballer.setBeoordeling(sc.nextInt());
            System.out.print("Doelpunten: ");
            voetballer.setDoelpunten(sc.nextInt());
            System.out.printf("Prijs: %.2f %n", voetballer.getPrijs());
            sc.nextLine();
            System.out.print("Naam: ");
            naam = sc.nextLine();
        }
    }
}
