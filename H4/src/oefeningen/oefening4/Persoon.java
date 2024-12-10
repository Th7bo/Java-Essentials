package oefeningen.oefening4;

import java.time.LocalDate;

public class Persoon {

    private String naam;
    private String voornaam;
    private LocalDate geboortedatum;
    private Adres adres;

    public Persoon(String naam, String voornaam, int dag, int maand, int jaar, String straat, String huisNummer, int postcode, String gemeenteNaam) {
        this(naam, voornaam, LocalDate.of(jaar, maand, dag), new Adres(straat, huisNummer, postcode, gemeenteNaam));
    }

    public Persoon(String naam, String voornaam, LocalDate geboortedatum, Adres adres) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.geboortedatum = geboortedatum;
        this.adres = adres;
    }

    public String toString() {
        return voornaam + " " + naam + System.lineSeparator() + adres;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
}
