package opdrachten.opdracht6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Omzetting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Geef een datum in:");
        LocalDate date = LocalDate.parse(sc.nextLine(), formatter);
        System.out.printf("Datum in formaat yyyy-MM-dd: %s%n", date.format(formatter2));
        System.out.printf("Dag: %d%n", date.getDayOfMonth());
        System.out.printf("Maand: %d%n", date.getMonthValue());
    }

}
