package oefeningen.oefening1.bestanden;

public class TekstBestand extends Bestand {


    public TekstBestand(String naam) {
        super(naam, naam.length() * 10);
    }

    @Override
    public void voerUit() {
        System.out.println(getNaam().toUpperCase());
        System.out.println(getInhoud());
    }
}
