package oefeningen.oefening1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Persoon {

    private String naam;
    private String voornaam;
    private double lengte;
    private double gewicht;
    private LocalDate geboortedatum;
    public static final double MAX_LENGTE = 2.40;

    public Persoon(String naam, String voornaam) {
        this.naam = naam;
        this.voornaam = voornaam;
    }

    public Persoon() {
        this("onbekend", "onbekend");
    }

    public Persoon(Persoon persoon) {
        this.naam = persoon.naam;
        this.voornaam = persoon.voornaam;
        this.lengte = persoon.lengte;
        this.geboortedatum = persoon.geboortedatum;
        this.gewicht = persoon.gewicht;
    }

    public String toString() {
        return String.format("""
                Deze persoon is %s %s
                %-20s: %.2f
                %-20s: %.2f
                %-20s: %s""", voornaam.toUpperCase(), naam.toUpperCase(), "gewicht", gewicht, "lengte", lengte, "geboortejaar", geboortedatum);
    }

    public double berekenBmi() {
        double bmi = gewicht / (lengte * lengte);
        return Math.round(bmi * 10) / 10.0;
    }

    public String geefOmschrijving() {
        double bmi = berekenBmi();
        if (bmi < 18) return "ondergewicht";
        else if (bmi < 25) return "normaal";
        else if (bmi < 30) return "overgewicht";
        else if (bmi < 35) return "obesitas";
        else return "morbide obesitas";
    }

    public void voegVoornamenToe(String[] namen) {
        StringBuilder builder = new StringBuilder(voornaam);
        for (String s : namen) {
            builder.append(" ").append(s);
        }
        voornaam = builder.toString();
    }

    public String encrypteerNaam(int getal) {
        StringBuilder builder = new StringBuilder();
        String volleNaam = geefNaamAfgekort();
        for (String c : volleNaam.split("")) {
            char ch = c.charAt(0);
            ch += getal;
            builder.append(ch);
        }
        return builder.toString();
    }

    public String geefNaamAfgekort() {
        return voornaam.toUpperCase().charAt(0) + "." +
                naam.toUpperCase().charAt(0) + naam.toLowerCase().substring(1);
    }

    public void groei() {
        groei(0.01);
    }

    public void groei(double aantal) {
        setLengte(lengte + aantal / 100);
    }

    public int getLeeftijd() {
        return LocalDate.now().getYear() - geboortedatum.getYear();
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

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        if (lengte < 0) lengte = 0;
        else if (lengte > MAX_LENGTE) lengte = MAX_LENGTE;
        this.lengte = lengte;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(LocalDate geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

}
