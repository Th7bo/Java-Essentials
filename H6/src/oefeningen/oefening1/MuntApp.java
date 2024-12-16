package oefeningen.oefening1;

import java.util.Random;
import java.util.Scanner;

public class MuntApp {

    public static void main(String[] args) {
        Random rand = new Random();
        int n = (int) (rand.nextDouble(0, 10.1) * 100);
        System.out.printf("Aantal eurocent %d%n", n);

        Munt[] munten = Munt.values();
        int[] voorkomen = new int[munten.length];
        for (Munt m : munten) {
            while (n >= m.getCenten()) {
                voorkomen[m.ordinal()]++;
                n -= m.getCenten();
            }
        }

        for (int i = 0; i < voorkomen.length; i++) {
            if (voorkomen[i] <= 0) continue;
            System.out.printf("Voorkomen %.2f euro: %d%n", munten[i].getCenten() / 100.0, voorkomen[i]);
        }

    }

}
