package oefeningen.oefening4;

public class Adres {

    private String straat;
    private String huisNummer;
    private final Gemeente gemeente;

    public Adres(String straat, String huisNummer, int postcode, String gemeenteNaam) {
        this.straat = straat;
        this.huisNummer = huisNummer;
        this.gemeente = new Gemeente(postcode, gemeenteNaam);
    }

    public String toString() {
        return straat + " " + huisNummer + System.lineSeparator() + gemeente;
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public String getHuisNummer() {
        return huisNummer;
    }

    public void setHuisNummer(String huisNummer) {
        this.huisNummer = huisNummer;
    }

    public Gemeente getGemeente() {
        return gemeente;
    }
}
