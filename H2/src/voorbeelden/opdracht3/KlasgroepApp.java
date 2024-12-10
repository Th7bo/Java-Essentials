package voorbeelden.opdracht3;

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
    }

}
