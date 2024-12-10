package opdrachten.opdracht8;

public class Cirkel extends GrafischElement {

    private double straal;

    public Cirkel(int x, int y, double straal) {
        super(x, y);
        this.straal = straal;
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        this.straal = straal;
    }

    @Override
    public double getOppervlakte() {
        return Math.PI * straal * straal;
    }

    @Override
    public double getOmtrek() {
        return 2 * Math.PI * straal;
    }
}
