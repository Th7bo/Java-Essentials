package oefeningen.oefening1.bestanden;

import oefeningen.oefening1.Uitvoerbaar;

import java.util.ArrayList;

public class Folder implements Uitvoerbaar {

    private String naam;
    ArrayList<Bestand> bestanden = new ArrayList<>();

    public Folder(String naam) {
        this.naam = naam;
    }

    public void voegBestandToe(Bestand[] b) {
        for (Bestand bestand : b) {
            bestanden.add(bestand);
        }
    }

    @Override
    public void voerUit() {
        System.out.println(naam);
        for (Bestand bestand : bestanden) {
            System.out.println(bestand);
        }
    }
}
