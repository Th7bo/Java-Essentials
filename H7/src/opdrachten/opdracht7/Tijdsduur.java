package opdrachten.opdracht7;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
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
    }

}
