package oefeningen.oefening4;

import oefeningen.Input;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class ScoutsKalenderApp {

    public static void main(String[] args) {
        ArrayList<Activiteit> activiteiten = new ArrayList<>();
        int year = Input.getInt("Geef het jaar in: ");
        int month = Input.getInt("Geef maandnummer in: ");
        int day = Input.getInt("Geef een dag in: ");

        while (day != 0) {
            LocalDate date = LocalDate.of(year, month, day);
            String naam = Input.getLine("Geef een activiteit in: ");
            Activiteit activiteit = new Activiteit(date, naam);
            activiteiten.add(activiteit);
            day = Input.getInt("Geef een dag in: ");
        }

        System.out.printf("*** Kalender voor %s %d ***%n", Month.of(month), year);
        for (Activiteit activiteit : activiteiten) System.out.println(activiteit);
    }

}
