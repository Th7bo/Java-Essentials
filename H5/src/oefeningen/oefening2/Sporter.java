package oefeningen.oefening2;

import oefeningen.oefening1.Persoon;

public class Sporter extends Persoon {

    private String sport;
    private static int teller;

    public Sporter(String naam, String voornaam) {
        this(naam, voornaam, "onbepaald");
    }

    public Sporter(String naam, String voornaam, String sport) {
        super(naam, voornaam);
        this.sport = sport;
        teller++;
    }

    public void print() {
        System.out.println(getVoornaam() + " " + getNaam() + System.lineSeparator() + sport);
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public static int getTeller() {
        return teller;
    }
}
