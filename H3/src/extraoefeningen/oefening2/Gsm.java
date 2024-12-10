package extraoefeningen.oefening2;

public class Gsm {

    private String gsmNummer;
    private int bouwjaar;
    private String merk;
    private String naamEigenaar;
    private String voornaamEigenaar;
    private int krediet;
    private int meterBatterij;
    private static int aantal;

    public Gsm() {
        this("", null, 0);
    }

    public Gsm(String gsmNummer, String merk) {
        this(gsmNummer, merk, 0);
    }

    public Gsm(String gsmNummer, String merk, int meterBatterij) {
        setGsmNummer(gsmNummer);
        this.merk = merk;
        this.meterBatterij = meterBatterij;
        aantal++;
    }



    private String capitalize(String s) {
        if (s == null || s.isEmpty()) return "";
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

    private String getFormattedName() {
        return capitalize(voornaamEigenaar) + " " + capitalize(naamEigenaar);
    }

    public void toonGSM() {
        if (merk == null) {
            System.out.println("Dit object is een leeg object en heeft geen eigen waarden voor zijn eigenschappen.");
            return;
        }
        System.out.printf("""
                Het gsmnummer %s van %s heeft de volgende kenmerken
                %-5s: %s
                %-5s: %s
                %-5s: %s
                %-5s: %s
                """, gsmNummer, getFormattedName(), "Bouwjaar", bouwjaar, "Merk", merk, "Krediet", krediet, "MeterBatterij", meterBatterij);
    }

    public void setGsmNummer(String gsmNummer) {
        if (!gsmNummer.startsWith("0")) gsmNummer = "ongeldig";
        if (gsmNummer.length() != 10) gsmNummer = "ongeldig";
        this.gsmNummer = gsmNummer;
    }

    private boolean checkOngeldigNummer() {
        boolean value = gsmNummer.equals("onbekend");
        if (value) System.out.println("Dit toestel heeft nog geen geldig GSM nummer, actie stopt");
        return value;
    }

    public void toonBeltijd() {
        System.out.println("Beltijd: " + (krediet * 60));
    }

    public void tik() {
        meterBatterij = Math.max(0, meterBatterij - 2);
    }

    public void laadOp() {
        meterBatterij = 200;
    }

    public String getGsmNummer() {
        return gsmNummer;
    }

    public int getBouwjaar() {
        return bouwjaar;
    }

    public void setBouwjaar(int bouwjaar) {
        if (checkOngeldigNummer()) return;
        this.bouwjaar = bouwjaar;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        if (checkOngeldigNummer()) return;
        this.merk = merk;
    }

    public String getNaamEigenaar() {
        return naamEigenaar;
    }

    public void setNaamEigenaar(String naamEigenaar) {
        if (checkOngeldigNummer()) return;
        this.naamEigenaar = naamEigenaar;
    }

    public String getVoornaamEigenaar() {
        return voornaamEigenaar;
    }

    public void setVoornaamEigenaar(String voornaamEigenaar) {
        if (checkOngeldigNummer()) return;
        this.voornaamEigenaar = voornaamEigenaar;
    }

    public int getKrediet() {
        return krediet;
    }

    public void setKrediet(int krediet) {
        if (checkOngeldigNummer()) return;
        this.krediet = krediet;
    }

    public int getMeterBatterij() {
        return meterBatterij;
    }

    public void setMeterBatterij(int meterBatterij) {
        if (checkOngeldigNummer()) return;
        this.meterBatterij = meterBatterij;
    }

    public static int getAantal() {
        return aantal;
    }
}
