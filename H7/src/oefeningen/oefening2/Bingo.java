package oefeningen.oefening2;

import java.util.ArrayList;
import java.util.Random;

public class Bingo {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<BingoKaart> kaarten = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            BingoKaart kaart = new BingoKaart("Kaart " + (i + 1));
            for (int j = 0; j < 5; j++) {
                kaart.addNumber(random.nextInt(0, 101));
            }
            kaarten.add(kaart);
        }

        for (BingoKaart kaart : kaarten) {
            System.out.println(kaart);
        }

        boolean won = false;
        while (!won) {
            int number = random.nextInt(0, 101);
            System.out.printf("Nummer %d getrokken%n", number);
            for (BingoKaart kaart : kaarten) {
                if (kaart.hasNumber(number) && !won) {
                    System.out.println("BINGO!!");
                    System.out.println(kaart);
                    won = true;
                }
            }
        }
    }

}
