package oefeningen.oefening1.bestanden;

import java.util.Arrays;
import java.util.Random;

public class Afbeelding extends Bestand {
    private int[] dimensies;
    private final Random rand = new Random();

    public Afbeelding(String naam, int[] dimensies) {
        super(naam, dimensies[0] * dimensies[1] * 3);
        this.dimensies = dimensies;
    }

    @Override
    public void voerUit() {
        System.out.println(getNaam());
        String[] letters = getInhoud().split("");
        for (int i = 0; i < dimensies[0]; i++) {
            for (int j = 0; j < dimensies[1]; j++) {
                System.out.print(letters[(rand.nextInt(letters.length))]);
            }
            System.out.println();
        }
    }
}
