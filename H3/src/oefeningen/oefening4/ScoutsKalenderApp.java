package oefeningen.oefening4;

import oefeningen.Input;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ScoutsKalenderApp {

    public static void main(String[] args) {
        ArrayList<Activiteit> activiteiten = new ArrayList<>();
        int year = Input.getInt("Geef het jaar in: ");
        int month = Input.getInt("Geef maandnummer in: ");
        int day = Input.getInt("Geef een dag in: ");
        LocalDate date = LocalDate.of(year, month, day);
        while (day != 0) {
            date = LocalDate.of(year, month, day);
            String naam = Input.getLine("Geef een activiteit in: ");
            Activiteit activiteit = new Activiteit(date, naam);
            activiteiten.add(activiteit);
            day = Input.getInt("Geef een dag in: ");
        }

        System.out.printf("*** Kalender voor %s %d ***%n", date.getMonth().name(), date.getYear());
        for (Activiteit activiteit : activiteiten) System.out.println(activiteit);
    }

}
