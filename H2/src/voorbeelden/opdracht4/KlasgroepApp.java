package voorbeelden.opdracht4;

public class KlasgroepApp {

    public static void main(String[] args) {
        System.out.println(Klasgroep.MAX_AANTAL_LEERLINGEN);
        Klasgroep[] klassen = new Klasgroep[10];
        for (int i = 0; i < klassen.length; i++) {
            char klas = 'a';
            klas += i;
            Klasgroep klasgroep = new Klasgroep("1TIN" + klas, 10);
            klassen[i] = klasgroep;
        }


        for (Klasgroep klasgroep : klassen) {
            System.out.printf("Klas %s heeft %d leerlingen%n", klasgroep.getKlasNaam(), klasgroep.getAantalLeerlingen());
        }

        System.out.printf("Aantal klassen %d%n", Klasgroep.getAantalObjecten());
        System.out.printf("Totaal aantal leerlingen %d%n", Klasgroep.getTotaalAantalLeerlingen());

        klassen[3].setAantalLeerlingen(9);

        for (Klasgroep klasgroep : klassen) {
            System.out.printf("Klas %s heeft %d leerlingen%n", klasgroep.getKlasNaam(), klasgroep.getAantalLeerlingen());
        }

        System.out.printf("Aantal klassen %d%n", Klasgroep.getAantalObjecten());
        System.out.printf("Totaal aantal leerlingen %d%n", Klasgroep.getTotaalAantalLeerlingen());


        int totaal = Klasgroep.getTotaalAantalLeerlingen();
        int aantalKlassen = Klasgroep.getAantalObjecten();
        double leerlingenPerKlas = (double) totaal / aantalKlassen;

        System.out.printf("Aantal leerlingen per klas: %.1f%n", leerlingenPerKlas);
    }

}
