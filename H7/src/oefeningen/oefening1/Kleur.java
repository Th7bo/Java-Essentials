package oefeningen.oefening1;

public class Kleur {

    private int rood;
    private int groen;
    private int blauw;

    private String hex;

    public Kleur(int rood, int groen, int blauw) {
        this.rood = rood;
        this.groen = groen;
        this.blauw = blauw;
        RGBToHex();
    }

    public Kleur(String hex) {
        if (!hex.startsWith("#")) {
            System.out.println("Ongeldige hexadecimale waarde");
            return;
        };
        this.hex = hex;
        hexToRGB();

    }

    private void hexToRGB() {
        rood = Integer.parseInt(hex.substring(1, 3), 16);
        groen = Integer.parseInt(hex.substring(3, 5), 16);
        blauw = Integer.parseInt(hex.substring(5, 7), 16);
    }


    private void RGBToHex() {
        hex = String.format("#%s%s%s", Integer.toHexString(rood), Integer.toHexString(groen), Integer.toHexString(blauw));
    }

    public void setHex(String hex) {
        this.hex = hex;
        hexToRGB();
    }

    public void setRGB(int rood, int groen, int blauw) {
        this.rood = rood;
        this.groen = groen;
        this.blauw = blauw;
        RGBToHex();
    }

    public String toString() {
        return String.format("%s (%d, %d, %d)", hex, rood, groen, blauw);
    }
}
