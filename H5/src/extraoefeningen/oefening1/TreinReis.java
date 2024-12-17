package extraoefeningen.oefening1;

import java.util.Arrays;

public class TreinReis extends Reis {

    private boolean nationaal;
    private static final String[] nationaleRitten = new String[] {"IC", "IR", "L", "P"};
    private String rit;

    public TreinReis(String bestemming, double prijs, boolean nationaal, String rit) {
        super(bestemming, prijs);
        setRit(rit);
        this.nationaal = nationaal;
    }

    public TreinReis(String bestemming) {
        this(bestemming, 0.0, true, "IC");
    }

    public String toString() {
        return super.toString() + System.lineSeparator() + ((nationaal) ? "Nationale " : "Internationale ") + "treinreis (" + rit + ")";
    }

    public static String[] getNationaleRitten() {
        return nationaleRitten;
    }

    public boolean isNationaal() {
        return nationaal;
    }

    public void setNationaal(boolean nationaal) {
        this.nationaal = nationaal;
    }

    public String getRit() {
        return rit;
    }

    public void setRit(String rit) {
        if (nationaal && Arrays.stream(nationaleRitten).noneMatch(n -> n.equals(rit))) this.rit = "IC";
        else this.rit = rit;
    }
}
