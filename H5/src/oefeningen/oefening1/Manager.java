package oefeningen.oefening1;

public class Manager extends Werknemer {

    private double bonus;
    private static int teller;


    public Manager(String naam, String voornaam, String functie, double salaris) {
        this(naam, voornaam, functie, salaris, 50.0);
    }

    public Manager(String naam, String voornaam, String functie, double salaris, double bonus) {
        super(naam, voornaam, functie, salaris);
        this.bonus = bonus;
        teller++;
    }

    @Override
    public double getSalaris() {
        return super.getSalaris() + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public static int getTeller() {
        return teller;
    }

    public static double getProcAandeelManagers() {
        return Math.floor(100.0 * ((double) teller / Werknemer.getTeller() * 100.0)) / 100.0;
    }
}
