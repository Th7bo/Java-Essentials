package voorbeelden.extra.opdracht1;

public class Voetballer {
    private String naam;
    private int rugnummer;
    private String positie;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getRugnummer() {
        return rugnummer;
    }

    public void setRugnummer(int rugnummer) {
        if (rugnummer < 1) {
            rugnummer = 1;
        } else if (rugnummer > 22) {
            rugnummer = 22;
        }
        this.rugnummer = rugnummer;

    }

    public void verhoogRugnummer() {
        setRugnummer(rugnummer + 1);
    }

    public void verhoogRugnummer(int extra) {
        setRugnummer(rugnummer + extra);
    }

    public String getPositie() {
        return positie;
    }

    public void setPositie(String positie) {
        this.positie = positie;
    }
}
