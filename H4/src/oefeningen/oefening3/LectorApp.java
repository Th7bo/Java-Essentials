package oefeningen.oefening3;

public class LectorApp {

    public static void main(String[] args) {
        Lector lector = new Lector("Thibo", "Franssen", 111);
        lector.voegVakToe(new Vak("Java Essentials", "41TIN1130", 6));
        lector.voegVakToe(new Vak("IT Essentials", "41TIN1130", 7));
        lector.voegVakToe(new Vak(".Net Advanced", "41TIN1130", 20));
        lector.voegVakToe(new Vak("Java Advanced", "41TIN1130", 6));
        lector.voegVakToe(new Vak("Programming Expert", "41TIN1130", 6));
        System.out.println(lector);
    }

}
