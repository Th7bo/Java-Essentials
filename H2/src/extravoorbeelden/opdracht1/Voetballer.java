package extravoorbeelden.opdracht1;

public class Voetballer {
    private String naam;
    private int rugnummer;
    private String positie = "onbekend";
    private static final String[] geldigePosities = {"Aanvaller", "Middenvelder", "Verdediger", "Doelman"};

    public Voetballer() {}

    public Voetballer(String naam) {
        this(naam, 0);
    }

    public Voetballer(String naam, int rugnummer) {
        this(naam, rugnummer, "onbekend");
    }

    public Voetballer(String naam, int rugnummer, String positie) {
        this.naam = naam;
        setRugnummer(rugnummer);
        setPositie(positie);
    }

    public Voetballer(Voetballer voetballer) {
        this(voetballer.naam, voetballer.rugnummer, voetballer.positie);
    }

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
        for (String p : geldigePosities) {
            if (p.equals(positie)) {
                this.positie = positie;
                return;
            }
        }
        this.positie = "onbekend";
    }

    public void voegNamenToe(String[] namen) {
        StringBuilder builder = new StringBuilder(naam);
        for (String n : namen) {
            builder.append(" ").append(n);
        }
        naam = builder.toString();
    }
}
