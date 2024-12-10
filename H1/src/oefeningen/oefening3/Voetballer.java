package oefeningen.oefening3;

public class Voetballer {

    private String naam;
    private int leeftijd;
    private double beoordeling;
    private String positie;
    private int doelpunten;


    public double getPrijs() {
        double basis;
        if (positie.equals("aanvaller")) {
            basis = 30_000;
        } else if (positie.equals("middenvelder")) {
            basis = 28_000;
        } else if (positie.equals("verdediger")) {
            basis = 29_000;
        } else {
            basis = 25_000;
        }

        if (leeftijd < 25) basis *= 1.1;
        else if (leeftijd > 30) basis *= 0.95;

        if (positie.equals("aanvaller")) {
            if (doelpunten >= 5) basis += (5 * 10_000) + (doelpunten - 5) * 20_000;
            else basis += (doelpunten * 10_000);
        } else {
            basis += beoordeling * 10_000;
            if (positie.equalsIgnoreCase("doelman")) {
                if (doelpunten >= 20) basis -= 9_000;
            }
        }

        return basis;
    }


    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public double getBeoordeling() {
        return beoordeling;
    }

    public void setBeoordeling(double beoordeling) {
        this.beoordeling = beoordeling;
    }

    public String getPositie() {
        return positie;
    }

    public void setPositie(String positie) {
        this.positie = positie;
    }

    public int getDoelpunten() {
        return doelpunten;
    }

    public void setDoelpunten(int doelpunten) {
        this.doelpunten = doelpunten;
    }
}
