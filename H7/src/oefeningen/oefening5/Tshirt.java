package oefeningen.oefening5;

public class Tshirt {

    private TShirtSize size;
    private Kleur kleur;
    private int aantal;

    public Tshirt(TShirtSize size, Kleur kleur, int aantal) {
        this.size = size;
        this.kleur = kleur;
        this.aantal = aantal;
    }

    public void addAantal(int aantal) {
        this.aantal += aantal;
    }

    public int getAantal() {
        return aantal;
    }

    public void setAantal(int aantal) {
        this.aantal = aantal;
    }

    public Kleur getKleur() {
        return kleur;
    }

    public void setKleur(Kleur kleur) {
        this.kleur = kleur;
    }

    public TShirtSize getSize() {
        return size;
    }

    public void setSize(TShirtSize size) {
        this.size = size;
    }
}
