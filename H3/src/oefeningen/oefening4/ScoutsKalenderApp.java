package oefeningen.oefening4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ScoutsKalenderApp {

    public static void main(String[] args) {
        ArrayList<Activiteit> activiteiten = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef het jaar in");
        int year = sc.nextInt();
        System.out.println("Geef maandnummer in");
        int month = sc.nextInt();
        System.out.println("Geef een dag in");
        int day = sc.nextInt();
        LocalDate date = LocalDate.of(year, month, day);
        while (day != 0) {
            date = LocalDate.of(year, month, day);
            System.out.println("Geef een activiteit in: ");
            sc.nextLine();
            String naam = sc.nextLine();
            Activiteit activiteit = new Activiteit(date, naam);
            activiteiten.add(activiteit);
            System.out.println("Geef een dag in");
            day = sc.nextInt();
        }

        System.out.printf("*** Kalender voor %s %d ***%n", date.getMonth().name(), date.getYear());
        for (Activiteit activiteit : activiteiten) System.out.println(activiteit);
    }

}
