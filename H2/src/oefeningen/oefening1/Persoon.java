package oefeningen.oefening1;

public class Persoon {

    private String naam;
    private String voornaam;
    private double lengte;
    private double gewicht;
    private int geboortejaar;
    private static final double MAX_LENGTE = 2.40;


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
        this.geboortejaar = persoon.geboortejaar;
        this.gewicht = persoon.gewicht;
    }

    public String toString() {
        return String.format("""
                Deze persoon is %s %s
                %-20s: %.2f
                %-20s: %.2f
                %-20s: %s""", voornaam, naam, "gewicht", gewicht, "lengte", lengte, "geboortejaar", geboortejaar);
    }

    public double berekenBmi() {
        return gewicht / (lengte * lengte);
    }

    public String geefOmschrijving() {
        double bmi = berekenBmi();
        if (bmi < 18) return "Ondergewicht";
        else if (bmi < 25) return "Normaal";
        else if (bmi < 30) return "Overgewicht";
        else if (bmi < 35) return "Obesitas";
        else return "Morbide obesitas";
    }

    public void voegVoornamenToe(String[] namen) {
        StringBuilder builder = new StringBuilder(voornaam);
        for (String s : namen) {
            builder.append(" ").append(s);
        }
        voornaam = builder.toString();
    }

    public void groei() {
        groei(1);
    }

    public void groei(double aantal) {
        setLengte(lengte + aantal);
    }

    public int getLeeftijd() {
        return 2024 - geboortejaar;
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

    public int getGeboortejaar() {
        return geboortejaar;
    }

    public void setGeboortejaar(int geboortejaar) {
        this.geboortejaar = geboortejaar;
    }

}
