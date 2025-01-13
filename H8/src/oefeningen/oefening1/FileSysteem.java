package oefeningen.oefening1;

import oefeningen.oefening1.bestanden.Afbeelding;
import oefeningen.oefening1.bestanden.Bestand;
import oefeningen.oefening1.bestanden.Folder;
import oefeningen.oefening1.bestanden.TekstBestand;

public class FileSysteem {
    public static void main(String[] args) {
        TekstBestand tekstBestand = new TekstBestand("Test.txt");
        tekstBestand.setInhoud("Wowzers");
        Afbeelding afbeelding = new Afbeelding("mijnafbeelding.png", new int[]{3, 10});
        afbeelding.setInhoud("#%$*");
        Folder folder = new Folder("Mijn Documenten");
        folder.voegBestandToe(new Bestand[]{tekstBestand, afbeelding});
        folder.voerUit();

        tekstBestand.voerUit();
        afbeelding.voerUit();
    }

}
