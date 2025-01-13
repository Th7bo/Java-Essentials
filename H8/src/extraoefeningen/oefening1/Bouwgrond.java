package extraoefeningen.oefening1;

import java.time.LocalDate;

public abstract class Bouwgrond implements Verkoopbaar {

    private String perceelNummer;
    private double perceelGrootte; // 1 are = 100 m^2
    private String bouwVoorschrift;

    public Bouwgrond(String perceelNummer, double perceelGrootte) {
        this.perceelNummer = perceelNummer;
        this.perceelGrootte = perceelGrootte;
    }

    public String getPerceelNummer() {
        return perceelNummer;
    }

    public void setPerceelNummer(String perceelNummer) {
        this.perceelNummer = perceelNummer;
    }

    public double getPerceelGrootte() {
        return perceelGrootte;
    }

    public void setPerceelGrootte(double perceelGrootte) {
        this.perceelGrootte = perceelGrootte;
    }

    public String getBouwVoorschrift() {
        return bouwVoorschrift;
    }

    public void setBouwVoorschrift(String bouwVoorschrift) {
        this.bouwVoorschrift = bouwVoorschrift;
    }

    public abstract void wijsEenNotarisToe(String naam, LocalDate datum);
    public abstract void doeEenBod(double prijs, LocalDate datum);
}
