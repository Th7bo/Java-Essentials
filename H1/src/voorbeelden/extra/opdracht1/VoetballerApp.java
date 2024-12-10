package voorbeelden.extra.opdracht1;

public class VoetballerApp {
    public static void main(String[] args) {
        Voetballer deBruyne = new Voetballer();
        deBruyne.setNaam("DeBruyne");
        deBruyne.setRugnummer(7);
        deBruyne.setPositie("Middenvelder");
        System.out.printf("Voetballer %s is een %s en heeft rugnummer %d %n", deBruyne.getNaam(), deBruyne.getPositie(), deBruyne.getRugnummer());

        deBruyne.verhoogRugnummer(100);

        System.out.printf("Voetballer %s is een %s en heeft rugnummer %d %n", deBruyne.getNaam(), deBruyne.getPositie(), deBruyne.getRugnummer());

    }

}
