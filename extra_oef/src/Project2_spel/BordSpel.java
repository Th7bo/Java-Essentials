package Project2_spel;

public class BordSpel extends Spel {
    private int aantalSpelers;
    private int speelDuur;

    public BordSpel(String naam, Uitgever uitgever) {
        super(naam, uitgever);
    }

    public int getAantalSpelers() {
        return aantalSpelers;
    }

    public void setAantalSpelers(int aantalSpelers) {
        if (aantalSpelers < 0) aantalSpelers = 1;
        this.aantalSpelers = aantalSpelers;
    }

    public int getSpeelDuur() {
        return speelDuur;
    }

    public void setSpeelDuur(int speelDuur) {
        if (speelDuur < 0) speelDuur = 30;
        this.speelDuur = speelDuur;
    }

    @Override
    public String toString() {
        return String.format("BordSpel{naam='%s', minimumLeeftijd=%d, %s, aantalSpelers=%d, speelDuur=%d}", getNaam(), getMinimumLeeftijd(), getUitgever(), aantalSpelers, speelDuur, speelDuur);
    }
}
