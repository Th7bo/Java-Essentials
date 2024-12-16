package opdrachten.opdracht3;

import java.time.Instant;
import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Instant start = Instant.now();
        System.out.println("Geef je naam in:");
        String naam = sc.nextLine();
        System.out.printf("Je deed hier %.2f seconden over%n", (Instant.now().toEpochMilli() - start.toEpochMilli()) / 1000.0);
    }

}
