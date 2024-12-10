package oefeningen.oefening1;

import java.util.ArrayList;
import java.util.Random;

public class Band {

    private String naam;
    private ArrayList<Muzikant> leden;
    private static final Random rand = new Random();

    public Band(String naam, ArrayList<Muzikant> leden) {
        this.naam = naam;
        this.leden = leden;
    }

    public void speel(int lengte) {
        System.out.println(naam + " in concert");
        for (int i = 0; i < lengte; i++) {
            int index = rand.nextInt(0, leden.size());
            Muzikant muzikant = leden.get(index);
            muzikant.speel();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(naam);
        sb.append("\n");
        for (Muzikant muzikant : leden) {
            sb.append(muzikant).append("\n");
        }
        return sb.toString();
    }
}
