package oefeningen.oefening1;

public class Werknemer extends Persoon {

    private String functie;
    private double salaris;
    private static final int MINIMUM_LOON = 1000;
    private static int teller;

    public Werknemer(String naam, String voornaam) {
        this(naam, voornaam, "algemeen bediende", 1800);
    }

    public Werknemer(String naam, String voornaam, String functie, double salaris) {
        super(naam, voornaam);
        this.functie = functie;
        setSalaris(salaris);
        teller++;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public double getSalaris() {
        return salaris;
    }

    public void setSalaris(double salaris) {
        this.salaris = Math.max(MINIMUM_LOON, salaris);
    }

    public static int getMinimalLoon() {
        return MINIMUM_LOON;
    }

    public static int getTeller() {
        return teller;
    }
}
