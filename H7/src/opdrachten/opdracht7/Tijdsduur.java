package opdrachten.opdracht7;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Tijdsduur {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Geef een datum in:");
        LocalDate date = LocalDate.parse(sc.nextLine(), formatter);
        Period period = Period.between(date, LocalDate.now());
        System.out.printf("Dagen: %d%n", period.getDays());
        System.out.printf("Maanden: %d%n", period.getMonths());
        System.out.printf("Jaren: %d%n", period.getYears());
        System.out.printf("Totaal aantal maanden: %d%n", period.toTotalMonths());
        System.out.printf("Totaal aantal maanden: %d%n", ChronoUnit.MONTHS.between(date, LocalDate.now()));

        LocalDate verjaardag = date.withYear(LocalDate.now().getYear());
        if (verjaardag.isBefore(LocalDate.now())) {
            verjaardag = verjaardag.plusYears(1);
        }
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE d MMM yyyy");
        System.out.printf("Volgende verjaardag %s%n", formatter2.format(verjaardag));

        Period diff = Period.between(LocalDate.now(), verjaardag);
        int dagen = diff.getDays();
        int maanden = diff.getMonths();
        System.out.printf("Dit is nog %s maanden en %s dagen%n", maanden, dagen);
        System.out.printf("Dit is nog %s dagen%n", ChronoUnit.DAYS.between(LocalDate.now(), verjaardag));
        Instant now = Instant.now();

    }

}
