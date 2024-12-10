package oefeningen.oefening1;

import oefeningen.Utils;

public class Instrument {

    private String naam;
    private String geluid;

    public Instrument(String naam, String geluid) {
        this.naam = naam;
        this.geluid = geluid;
    }

    public void speel() {
        System.out.println(geluid);
    }

    public String toString() {
        return Utils.capitalize(naam);
    }
}
