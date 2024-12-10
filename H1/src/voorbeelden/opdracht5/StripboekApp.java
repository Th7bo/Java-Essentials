package voorbeelden.opdracht5;

public class StripboekApp {
    public static void main(String[] args) {
        Stripboek stripboek = new Stripboek();
        stripboek.setReeks("Suske en Wiske");
        stripboek.setTitel("Titel 1");
        stripboek.setAlbum(1);
        stripboek.setReeks("Willy Vandersteen");

        System.out.println("Reeks: " + stripboek.getReeks());
        System.out.println("Titel: " + stripboek.getTitel());
        System.out.println("Album: " + stripboek.getAlbum());
        System.out.println("Reeks: " + stripboek.getReeks());
    }
}
