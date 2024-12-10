package oefeningen.oefening3;

public class Lector {

    private String naam;
    private String achternaam;
    private Vak[] vakken = new Vak[MAXIMUM_AANTALVAKKEN];
    private int aanstellingsfactor;
    private static final int MAXIMUM_AANTALVAKKEN = 5;

    public Lector(String naam, String achternaam, int aanstellingsfactor) {
        this.naam = naam;
        this.achternaam = achternaam;
        if (aanstellingsfactor > 100) System.out.printf("De aanstellingsfactor van %s mag niet hoger dan 100%% zijn.%n", naam);
        this.aanstellingsfactor = Math.min(aanstellingsfactor, 100);
    }

    public Lector(String naam, String achternaam) {
        this(naam, achternaam, 1);
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(String.format("Leraar %s is aangesteld voor %d%%", naam, aanstellingsfactor)).append("\n");
        str.append("Volgende vakken behoren tot het takenpakket:").append("\n");
        for (Vak vak : vakken) {
            str.append(vak.toString()).append("\n");
        }
        return str.toString();
    }

    public void drukGegevens() {
        System.out.println(this);
    }

    public void verwijderVak(String vak) {
        if (getVakIndexInVakken(vak) != -1) return;
        vakken[getVakIndexInVakken(vak)] = null;
    }

    public void voegVakToe(Vak vak) {
        if (getEersteVrijePlaats() == -1) {
            System.out.printf("De lector %s mag maximaal %d vakken hebben.", naam, MAXIMUM_AANTALVAKKEN);
            return;
        }
        if (getVakIndexInVakken(vak.getCode()) != -1) vakken[getEersteVrijePlaats()] = vak;
    }

    public int getEersteVrijePlaats() {
        for (int i = 0; i < vakken.length; i++) {
            if (vakken[i] == null) return i;
        }
        return -1;
    }

    public int getVakIndexInVakken(String vak) {
        for (int i = 0; i < vakken.length; i++) {
            if (vakken[i] != null && vakken[i].getCode().equals(vak)) return i;
        }
        return -1;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public Vak[] getVakken() {
        return vakken;
    }

    public void setVakken(Vak[] vakken) {
        this.vakken = vakken;
    }

    public int getAanstellingsfactor() {
        return aanstellingsfactor;
    }

    public void setAanstellingsfactor(int aanstellingsfactor) {
        this.aanstellingsfactor = aanstellingsfactor;
    }
}
