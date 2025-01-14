package Project2_spel;

public abstract class Spel {

    private String naam;
    private int minimumLeeftijd;
    private Uitgever uitgever;

    public Spel(String naam, Uitgever uitgever) {
        this.naam = naam;
        this.uitgever = uitgever;
    }

    public Uitgever getUitgever() {
        return uitgever;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getMinimumLeeftijd() {
        return minimumLeeftijd;
    }

    public void setMinimumLeeftijd(int minimumLeeftijd) {
        if (minimumLeeftijd < 0) minimumLeeftijd = 12;
        this.minimumLeeftijd = minimumLeeftijd;
    }
}
