package voorbeelden.opdracht2;

public class Auto {
    private String merk;
    private String kleur;
    private int kilometerStand;
    private int aantalDeuren;

    private int nummer = 5;

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String getKleur() {
        return kleur;
    }

    public int getKilometerStand() {
        return kilometerStand;
    }
}
