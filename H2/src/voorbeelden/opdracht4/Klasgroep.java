package voorbeelden.opdracht4;

public class Klasgroep {

    private String klasNaam;
    private int aantalLeerlingen;
    public static final int MAX_AANTAL_LEERLINGEN = 40;
    private static int aantalObjecten = 0;
    private static int totaalAantalLeerlingen = 0;

    public static int getAantalObjecten() {
        return aantalObjecten;
    }

    public static int getTotaalAantalLeerlingen() {
        return totaalAantalLeerlingen;
    }

    public Klasgroep(String klasNaam, int aantalLeerlingen) {
        this.klasNaam = klasNaam;
        if (aantalLeerlingen > MAX_AANTAL_LEERLINGEN) aantalLeerlingen = MAX_AANTAL_LEERLINGEN;
        this.aantalLeerlingen = aantalLeerlingen;
        aantalObjecten++;
        totaalAantalLeerlingen += aantalLeerlingen;
    }

    public Klasgroep() {
        this("1TINx", 0);
    }

    public String getKlasNaam() {
        return klasNaam;
    }

    public void setKlasNaam(String klasNaam) {
        this.klasNaam = klasNaam;
    }

    public int getAantalLeerlingen() {
        return aantalLeerlingen;
    }

    public void setAantalLeerlingen(int aantalLeerlingen) {
        if (aantalLeerlingen > MAX_AANTAL_LEERLINGEN) aantalLeerlingen = MAX_AANTAL_LEERLINGEN;
        totaalAantalLeerlingen -= this.aantalLeerlingen;
        this.aantalLeerlingen = aantalLeerlingen;
        totaalAantalLeerlingen += this.aantalLeerlingen;
    }
}
