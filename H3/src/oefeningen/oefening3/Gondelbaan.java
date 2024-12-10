package oefeningen.oefening3;

import java.util.ArrayList;
import java.util.Arrays;

public class Gondelbaan {

    private String naam;
    private String land;
    private int hoogteDalstation;
    private int hoogteBergstation;
    private double lengte;
    private int snelheid;
    private int passagiersPerGondel;
    private int aantalGondels;
    private ArrayList<String> geldigeLanden = new ArrayList<>(Arrays.asList("frankrijk", "oostenrijk", "zwitserland", "italië"));

    public Gondelbaan(String naam, String land, double lengte, int snelheid) {
        setLand(land);
        this.lengte = lengte;
        setSnelheid(snelheid);
        this.lengte = lengte;

        setNaam(naam);
    }

    public Gondelbaan(String naam, String land) {
        this(naam, land, 2, 6);
    }

    public double getDuur() {
        return (lengte * 1000/snelheid)/60;
    }

    public int getVervoersCapaciteit() {
        if (passagiersPerGondel == 0) return 0;

        return (int) ((60 * aantalGondels * passagiersPerGondel) / getDuur());
    }

    public String toString() {
        return getNaam() + " [" + getHoogteVerschil() + "m]";
    }

    public void setHoogte(int hoogte1, int hoogte2) {
        hoogteDalstation = Math.min(hoogte1, hoogte2);
        hoogteBergstation = Math.max(hoogte1, hoogte2);
    }

    public int getHoogteVerschil() {
        return hoogteBergstation - hoogteDalstation;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        StringBuilder nieuweNaam = new StringBuilder();
        for (String woord : naam.split(" ")) {
            nieuweNaam.append(woord.toUpperCase().charAt(0)).append(woord.substring(1).toLowerCase()).append(" ");
        }
        this.naam = nieuweNaam.toString().trim();
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        if (!geldigeLanden.contains(land.toLowerCase())) land = "Onbekend";
        this.land = land;
    }

    public int getHoogteDalstation() {
        return hoogteDalstation;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public int getSnelheid() {
        return snelheid;
    }

    public void setSnelheid(int snelheid) {
        this.snelheid = Math.max(3, Math.min(8, snelheid));;
    }

    public int getPassagiersPerGondel() {
        return passagiersPerGondel;
    }

    public void setPassagiersPerGondel(int passagiersPerGondel) {
        this.passagiersPerGondel = passagiersPerGondel;
    }

    public int getAantalGondels() {
        return aantalGondels;
    }

    public void setAantalGondels(int aantalGondels) {
        this.aantalGondels = aantalGondels;
    }

    public int getHoogteBergstation() {
        return hoogteBergstation;
    }
}
