package Project2_spel;

import java.time.LocalDate;

public class Speler {

    private String naam;
    private int geboortejaar;

    public Speler(String naam, int geboortejaar) {
        this.naam = naam;
        setGeboortejaar(geboortejaar);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getGeboortejaar() {
        return geboortejaar;
    }

    public void setGeboortejaar(int geboortejaar) {
        if (geboortejaar < 1900 || geboortejaar > LocalDate.now().getYear()) geboortejaar = 0;
        this.geboortejaar = geboortejaar;
    }

    public int getLeeftijd() {
        if (geboortejaar == 0) return -1;
        return LocalDate.now().getYear() - geboortejaar;
    }
}
