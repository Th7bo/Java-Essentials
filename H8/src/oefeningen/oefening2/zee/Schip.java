package oefeningen.oefening2.zee;

import oefeningen.oefening2.Beweegbaar;
import oefeningen.oefening2.Punt;

public class Schip extends ZeeObject implements Beweegbaar {

    private int snelheid;

    public Schip(int x, int y, Alliantie alliantie, int levensPunten, int snelheid) {
        super(x, y, alliantie, levensPunten);
        this.snelheid = snelheid;
    }

    @Override
    public void beweegNaar(Punt p) {
        if (super.getLevensPunten() <= 0) return;
        if (super.getLocatie().berekenAfstand(p) > snelheid) return;
        super.setLocatie(p);
    }

    public String toString() {
        return "Schip: " + super.toString();
    }
}
