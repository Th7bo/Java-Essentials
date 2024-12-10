package oefeningen.oefening1;

import java.util.Random;

public class PersoonApp {

    public static void main(String[] args) {
        Random rand = new Random();
        Persoon persoon = new Persoon("Franssen", "Thibo");
        double gewicht = 40.0 + (100.0 - 40.0) * rand.nextDouble();
        persoon.setGewicht(gewicht);
        double lengte = 1.57 + (2.10 - 1.57) * rand.nextDouble();
        persoon.setLengte(lengte);
        System.out.println(persoon.geefNaamAfgekort());
        System.out.println(persoon.encrypteerNaam(rand.nextInt(1, 21)));
    }

}
