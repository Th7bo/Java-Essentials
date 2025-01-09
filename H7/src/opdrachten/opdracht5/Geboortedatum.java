package opdrachten.opdracht5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Scanner;

public class Geboortedatum {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Geef je geboortedatum in (dd/mm/yyyy):");
//        String[] split = sc.nextLine().split("/");
//        int day = Integer.parseInt(split[0]);
//        int month = Integer.parseInt(split[1]);
//        int year = Integer.parseInt(split[2]);
//        LocalDate geboortedatum = LocalDate.of(year, month, day);
//        System.out.printf("Je bent geboren op de %se dag van het jaar%n", geboortedatum.getDayOfYear());
//        System.out.printf("Je bent geboren op de %se dag van de week%n", geboortedatum.getDayOfWeek().getValue());
//        System.out.printf("Dit jaar is %s%n", (geboortedatum.isLeapYear() ? "" : "g") + "een schrikkeljaar");

        LocalDateTime moment = LocalDateTime.of(2018, 10, 14, 22, 32, 27);
        System.out.println(moment);
        LocalDateTime later = moment.plusYears(1).plusMonths(2).plusWeeks(3).minusHours(13);
        System.out.println("Dit is op een " + later.getDayOfWeek());
    }

}
