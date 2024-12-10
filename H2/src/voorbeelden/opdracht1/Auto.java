package voorbeelden.opdracht1;

public class Auto {
    private String merk;
    private String kleur;
    private int kilometerstand;
    private int aantalDeuren;
    private boolean isAutomaat;

    public Auto() {}

    public Auto(String merk, String kleur, int aantalDeuren) {
        this.merk = merk;
        this.kleur = kleur;
        this.aantalDeuren = aantalDeuren;
    }

    public Auto(String merk, String kleur, int aantalDeuren, int kilometerstand) {
        this.merk = merk;
        this.kleur = kleur;
        this.aantalDeuren = aantalDeuren;
        this.kilometerstand = kilometerstand <= 0 ? 0 : kilometerstand;
    }

    public Auto(Auto auto) {
        this.merk = auto.merk;
        this.kleur = auto.kleur;
        this.kilometerstand = auto.kilometerstand;
        this.aantalDeuren = auto.aantalDeuren;
        this.isAutomaat = auto.isAutomaat;
    }

    public boolean getAutomaat() { return isAutomaat; }

    public void setAutomaat(boolean automaat) {
        this.isAutomaat = automaat;
    }

    public String getMerk() {
        return merk;
    }

    public String getKleur() {
        return kleur;
    }

    public int getKilometerstand() {
        return kilometerstand;
    }

    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
    }

    public void setAantalDeuren(int aantalDeuren) {
        this.aantalDeuren = aantalDeuren;
    }

    public double getPrijs() {
        double prijs = 20_000;
        if (this.getAantalDeuren() == 5) prijs += 2000;
        else if (this.getAantalDeuren() == 3) prijs -= 500;

        if (this.getAutomaat()) prijs += 2000;
        else prijs *= 0.98;
        return prijs;
    }

    public void drukGegevens() {
        System.out.println("De auto is van merk: " + this.merk);
        System.out.println("Kleur: " + this.kleur);
        System.out.println("De kostprijs is: " + this.getPrijs());
        System.out.println("Automaat: " + this.isAutomaat);
        System.out.println(isAutomaat ? "Auto is automaat" : "Auto is manueel");
        System.out.println("Kilometerstand: " + this.kilometerstand);
        System.out.println("Aantal deuren: " + this.aantalDeuren);
    }
}
