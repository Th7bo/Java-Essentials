package extraoefeningen.oefening1.spelers;

import extraoefeningen.oefening1.Bord;
import extraoefeningen.oefening1.Zet;

public class Speler {

    private String naam;
    private char teken;
    private Zet zet;

    public Speler(String naam, char teken) {
        this.naam = naam;
        this.teken = teken;
    }

    public String getNaam() {
        return naam;
    }

    public char getTeken() {
        return teken;
    }

    public Zet getZet(Bord bord) {
        return zet;
    }
}
