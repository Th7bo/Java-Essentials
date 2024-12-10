package oefeningen.oefening3;

public class Vak {

    private String naam;
    private String code;
    private int studiepunten;

    public Vak(String naam, String code, int studiepunten) {
        this.naam = naam;
        this.code = code;
        if (studiepunten > 18) System.out.printf("Het vak %s mag niet meer dan 18 SP hebben.%n", naam);
        this.studiepunten =  Math.min(18, studiepunten);
    }

    public Vak(String naam, String code) {
        this(naam, code, 0);
    }

    public String toString() {
        return String.format("%5s %-15s %-25s %-5s", "", code, naam, studiepunten);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getStudiepunten() {
        return studiepunten;
    }

    public void setStudiepunten(int studiepunten) {
        this.studiepunten = studiepunten;
    }
}
