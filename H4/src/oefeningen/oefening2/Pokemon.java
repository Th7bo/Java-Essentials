package oefeningen.oefening2;

import oefeningen.Utils;

public class Pokemon {

    private String naam;
    private String type;

    public Pokemon(String naam, String type) {
        this.naam = naam;
        this.type = type;
    }

    public String toString() {
        return Utils.capitalize(naam) + " (" + Utils.capitalize(type) + ")";
    }

    public String getNaam() {
        return naam;
    }

    public String getType() {
        return type;
    }
}
