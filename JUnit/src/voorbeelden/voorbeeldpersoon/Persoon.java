package voorbeelden.voorbeeldpersoon;

public class Persoon {
    private String naam;
    private String voornaam;

    public Persoon(String naam, String voornaam) {
        this.naam = naam;
        this.voornaam = voornaam;
    }

    public String getVolledigeNaam() {
        return (voornaam != null ? voornaam : "?") + " " + (naam != null ? naam : "?");
    }




}
