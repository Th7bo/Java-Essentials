package extraoefeningen.oefening1;

public abstract class Reis {

    private double prijs;
    private String bestemming;
    private static final double MINIMUM_PRIJS = 5.0;

    public Reis(String bestemming, double prijs) {
        setPrijs(prijs);
        setBestemming(bestemming);
    }

    public Reis(String bestemming) {
        this(bestemming, MINIMUM_PRIJS);
    }

    @Override
    public String toString() {
        return String.format("Reis met bestemming %s kost %.2f euro.", bestemming, Math.round(prijs * 100) / 100.0);
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = Math.max(MINIMUM_PRIJS, prijs);
    }

    public static double getMinimumPrijs() {
        return MINIMUM_PRIJS;
    }

    public String getBestemming() {
        return bestemming;
    }

    public void setBestemming(String bestemming) {
        boolean added = false;
        StringBuilder builder = new StringBuilder();
        for (char c : bestemming.toCharArray()) {
            if (!added && Character.isDigit(c)) continue;
            added = true;
            builder.append(c);
        }
        this.bestemming = builder.toString();
    }
}
