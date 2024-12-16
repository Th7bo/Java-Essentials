package extraoefeningen.oefening1;

import extraoefeningen.oefening1.spelers.MenselijkeSpeler;
import extraoefeningen.oefening1.spelers.RandomComputerSpeler;
import extraoefeningen.oefening1.spelers.Speler;

public class TicTacToe {

    public static void main(String[] args) {
        Bord bord = new Bord();
        Speler speler1 = new MenselijkeSpeler("Menselijke Speler", 'X');
        Speler speler2 = new RandomComputerSpeler("Computer", 'O');
        Speler huidigeSpeler = speler1;

        while (!bord.isVol() && !bord.isGewonnen()) {
            System.out.println(bord);
            Zet zet = huidigeSpeler.getZet(bord);
            bord.doeZet(zet);
            huidigeSpeler = huidigeSpeler == speler1 ? speler2 : speler1;
        }

        System.out.println(bord);
        System.out.println("Het spel is gedaan");
        Speler winnaar = huidigeSpeler == speler1 ? speler2 : speler1;
        if (bord.isGewonnen()) {
            System.out.println("De winnaar is: " + winnaar.getNaam());
        } else {
            System.out.println("Het is een gelijkspel");
        }

    }

}
