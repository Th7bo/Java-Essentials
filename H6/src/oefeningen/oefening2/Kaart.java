package oefeningen.oefening2;

public class Kaart {

    private Soort soort;
    private Waarde waarde;

    public Kaart(Soort soort, Waarde waarde) {
        this.soort = soort;
        this.waarde = waarde;
    }

    public String toString() {
        return soort.toString().toLowerCase() + " " + waarde.toString().toLowerCase();
    }

    public Soort getSoort() {
        return soort;
    }

    public void setSoort(Soort soort) {
        this.soort = soort;
    }

    public Waarde getWaarde() {
        return waarde;
    }

    public void setWaarde(Waarde waarde) {
        this.waarde = waarde;
    }
}
