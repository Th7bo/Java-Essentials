package oefeningen.oefening1;

import java.util.ArrayList;

public class BandApp {

    public static void main(String[] args) {
        Instrument gitaar = new Instrument("gitaar", "ting");
        Instrument piano = new Instrument("piano", "tong");
        ArrayList<Muzikant> muzikanten = new ArrayList<>();
        muzikanten.add(new Muzikant("Sam", gitaar));
        muzikanten.add(new Muzikant("Joris", piano));
        Band band = new Band("PXL-digital", muzikanten);
        band.speel(5);
        System.out.println(band);
    }

}
