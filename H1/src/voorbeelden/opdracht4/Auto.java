package voorbeelden.opdracht4;

public class Auto {
    private String merk;
    private String kleur;
    private int kilometerstand;
    private int aantalDeuren;

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

    public void drukGegevens() {
        System.out.println("De auto is van merk: " + merk);
        System.out.println("Kleur: " + kleur);
        System.out.println("Kilometerstand: " + kilometerstand);
        System.out.println("Aantal deuren: " + aantalDeuren);
    }
}
