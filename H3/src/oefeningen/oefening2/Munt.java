package oefeningen.oefening2;

public class Munt {

    private String naam;
    private double koers;
    private final static int AFRONDING = 3;
    private static int aantal;

    public Munt() {
        this("Euro", 1);
    }

    public Munt(String naam, double koers) {
        this.naam = naam;
        this.koers = koers;
        aantal++;
    }

    public String getNaam() {
        return naam.toUpperCase();
    }

    public static int getAantal() {
        return aantal;
    }

    public double getKoers() {
        double pow = Math.pow(10, AFRONDING);
        return Math.round(koers * pow) / pow;
    }

    public double getKoersTov(Munt m) {
        double pow = Math.pow(10, AFRONDING);
        return Math.round((koers / m.getKoers()) * pow) / pow;
    }

    public static int getAfronding() {
        return AFRONDING;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setKoers(double koers) {
        this.koers = koers;
    }

    public static void setAantal(int aantal) {
        Munt.aantal = aantal;
    }
}
