package opdrachten.opdracht4;

import java.time.DayOfWeek;
import java.util.Scanner;

public class DayTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef een weekdag (1-7):");
        int day = sc.nextInt();
        DayOfWeek dayOfWeek = DayOfWeek.of(day);
        System.out.printf("> Startdag: %s%n", dayOfWeek.name());
        System.out.println("Hoeveel dagen er bij tellen?");
        int days = sc.nextInt();
        DayOfWeek newDay = dayOfWeek.plus(days);
        System.out.printf("> Resultaat: %s%n", newDay.name());
    }

}
