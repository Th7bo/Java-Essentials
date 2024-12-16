package extraoefeningen.oefening1.spelers;

import extraoefeningen.oefening1.Bord;
import extraoefeningen.oefening1.Zet;

public class RandomComputerSpeler extends Speler {

    public RandomComputerSpeler(String naam, char teken) {
        super(naam, teken);
    }

    @Override
    public Zet getZet(Bord bord) {
        int rij = (int) (Math.random() * 3);
        int kolom = (int) (Math.random() * 3);
        Zet zet = new Zet(super.getTeken(), rij, kolom);
        while (bord.isGeldigeZet(zet)) {
            rij = (int) (Math.random() * 3);
            kolom = (int) (Math.random() * 3);
            zet.setKolom(kolom);
            zet.setRij(rij);
        }
        return zet;
    }
}
