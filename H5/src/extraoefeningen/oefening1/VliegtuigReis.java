package extraoefeningen.oefening1;

public class VliegtuigReis extends Reis {

    private String vluchtnummer;
    private static final double MINIMUM_PRIJS = 25;

    public VliegtuigReis(String bestemming) {
        this(bestemming, MINIMUM_PRIJS, bestemming.charAt(0) + "999");
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

    public void setVluchtnummer(String vluchtnummer) {
        this.vluchtnummer = vluchtnummer;
    }
}
