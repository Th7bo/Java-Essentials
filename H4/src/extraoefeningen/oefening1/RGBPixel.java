package extraoefeningen.oefening1;

public class RGBPixel {

    private int rood;
    private int groen;
    private int blauw;

    public RGBPixel(int rood, int groen, int blauw) {
        this.rood = rood;
        this.groen = groen;
        this.blauw = blauw;
    }

    public void naarGrijswaarde() {
        int gemiddelde = (rood + groen + blauw) / 3;
        rood = gemiddelde;
        groen = gemiddelde;
        blauw = gemiddelde;
    }

    public void naarInvert() {
        rood = 255 - rood;
        groen = 255 - groen;
        blauw = 255 - blauw;
    }

    public void verduister(double aantal) {
        rood *= aantal;
        groen *= aantal;
        blauw *= aantal;
    }

    public void verduister() {
        verduister(0.6);
    }

    public String toString() {
        return "(" + rood + ", " + groen + ", " + blauw + ")";
    }

    public int getRood() {
        return rood;
    }

    public int getGroen() {
        return groen;
    }

    public int getBlauw() {
        return blauw;
    }
}
