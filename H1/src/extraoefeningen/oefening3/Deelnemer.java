package extraoefeningen.oefening3;

public class Deelnemer {

    private String naam;
    private int[] sfeerPunten;
    private int[] etenPunten;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void init(int aantal) {
        this.etenPunten = new int[aantal];
        this.sfeerPunten = new int[aantal];
    }

    public int getScore() {
        int score = 0;
        for (int i = 0; i < etenPunten.length; i++) {
            score += etenPunten[i];
            score += sfeerPunten[i];
        }
        return score;
    }

    public int[] getSfeerPunten() {
        return sfeerPunten;
    }

    public void setSfeerPunten(int[] sfeerPunten) {
        this.sfeerPunten = sfeerPunten;
    }

    public int[] getEtenPunten() {
        return etenPunten;
    }

    public void setEtenPunten(int[] etenPunten) {
        this.etenPunten = etenPunten;
    }

    public void addEtenPunten(int punt) {
        this.etenPunten[this.etenPunten.length-1] += punt;
    }

    public void addSfeerPunten(int punt) {
        this.sfeerPunten[this.sfeerPunten.length-1] += punt;
    }
}
