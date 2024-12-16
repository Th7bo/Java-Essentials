package extraoefeningen.oefening1;

public class Zet {

    private char teken;
    private int rij;
    private int kolom;

    public Zet(char teken, int rij, int kolom) {
        this.teken = teken;
        this.rij = rij;
        this.kolom = kolom;
    }

    public char getTeken() {
        return teken;
    }

    public void setTeken(char teken) {
        this.teken = teken;
    }

    public int getRij() {
        return rij;
    }

    public void setRij(int rij) {
        this.rij = rij;
    }

    public int getKolom() {
        return kolom;
    }

    public void setKolom(int kolom) {
        this.kolom = kolom;
    }
}
