package extraoefeningen.oefening1;

public class VliegtuigReis extends Reis {

    private String vluchtnummer;
    private static final double MINIMUM_PRIJS = 25;

    public VliegtuigReis(String bestemming) {
        this(bestemming, getMinimumPrijs(), bestemming.charAt(0) + "999");
    }

    public VliegtuigReis(String bestemming, double prijs, String vluchtnummer) {
        super(bestemming, prijs);
        setVluchtnummer(vluchtnummer);
    }

    public static double getMinimumPrijs() {
        return MINIMUM_PRIJS;
    }

    public String getVluchtnummer() {
        return vluchtnummer;
    }

    public String toString() {
        return super.toString() + System.lineSeparator() + "Vliegtuigreis (vluchtnummer " + vluchtnummer + ")";
    }

    public void setVluchtnummer(String vluchtnummer) {
        if (!vluchtnummer.startsWith(Character.toString(getBestemming().charAt(0)))) {
            vluchtnummer = getBestemming().charAt(0) + vluchtnummer.substring(1);
        }
        this.vluchtnummer = vluchtnummer;
    }
}
