package extraoefeningen.oefening1;

import java.util.Random;
import java.util.Scanner;

public class Berekening {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Getal: ");
        double getal = scanner.nextDouble();
        System.out.println(bereken(getal));
    }

    private static double bereken(double getal) {
        double random = Math.round(RANDOM.nextDouble() * 6000 * 1000) / 1000.0;
        double normaal = Math.E * Math.sqrt(Math.pow(getal, 2) + Math.pow(random, 3));
        return Math.round(normaal * 1000) / 1000.0;
    }

}
