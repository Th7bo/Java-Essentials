package oefeningen.oefening4;

public class HuwelijkApp {

    public static void main(String[] args) {
        Persoon persoon1 = new Persoon("Thibo", "Franssen", 25, 7, 2006, "Kerkstraat", "20a", 3440, "Zoutleeuw");
        Persoon persoon2 = new Persoon("Thibo2", "Franssen", 25, 7, 2006, "Kerkstraat", "20a", 3440, "Zoutleeuw");

        Huwelijk huwelijk = new Huwelijk(persoon1, persoon2, 2, 2, 2024);
        huwelijk.print();
    }

}
