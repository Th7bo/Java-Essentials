package oefeningen.oefening2.zee;

import oefeningen.oefening2.Punt;
import oefeningen.oefening2.Vernietigbaar;

public abstract class ZeeObject implements Vernietigbaar {
    private Punt locatie;
    private Alliantie alliantie;
    private int levensPunten;

    public ZeeObject(int x, int y, Alliantie alliantie, int levensPunten) {
        this.locatie = new Punt(x, y);
        this.alliantie = alliantie;
        this.levensPunten = levensPunten;
    }

    @Override
    public void ontvangSchade(int aantal) {
        this.levensPunten -= aantal;
    }

    @Override
    public String toString() {
        return locatie.toString() + " " + levensPunten;
    }

    public Punt getLocatie() {
        return locatie;
    }

    public void setLocatie(Punt locatie) {
        this.locatie = locatie;
    }

    public Alliantie getAlliantie() {
        return alliantie;
    }

    public void setAlliantie(Alliantie alliantie) {
        this.alliantie = alliantie;
    }

    public int getLevensPunten() {
        return levensPunten;
    }

    public void setLevensPunten(int levensPunten) {
        this.levensPunten = levensPunten;
    }
}
