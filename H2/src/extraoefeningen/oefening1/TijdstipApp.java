package extraoefeningen.oefening1;

public class TijdstipApp {

    public static void main(String[] args) {
        for (int i = 0; i <= 24; i++) {
            Tijdstip tijdstip = new Tijdstip(i, 0, 0);
            System.out.println(tijdstip.toStringTijd(false));
        }

    }

}
