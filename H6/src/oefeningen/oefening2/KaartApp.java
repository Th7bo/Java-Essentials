package oefeningen.oefening2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class KaartApp {

    public static void main(String[] args) {
        ArrayList<Kaart> kaart = new ArrayList<>();
        for (Soort soort : Soort.values()) {
            for (Waarde waarde : Waarde.values()) {
                kaart.add(new Kaart(soort, waarde));
            }
        }

        Collections.shuffle(Arrays.asList(kaart));

        Random rand = new Random();
        Kaart computerKaart = kaart.get(rand.nextInt(kaart.size()));
        Kaart spelerKaart = kaart.get(rand.nextInt(kaart.size()));
        while (computerKaart.getWaarde().ordinal() == spelerKaart.getWaarde().ordinal()) {
            spelerKaart = kaart.get(rand.nextInt(kaart.size()));
            computerKaart = kaart.get(rand.nextInt(kaart.size()));
            System.out.println("Geen winnaar, kies nieuwe kaarten.");
        }
        if (computerKaart.getWaarde().ordinal() > spelerKaart.getWaarde().ordinal()) {
            System.out.printf("Winnaar computer %s%n", computerKaart);
            System.out.printf("Verliezer speler %s%n", spelerKaart);
        } else {
            System.out.printf("Winnaar speler %s%n", spelerKaart);
            System.out.printf("Verliezer computer %s%n", computerKaart);
        }
    }
}
