package voorbeelden.opdracht4;

public class AutoApp {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.setMerk("Porsche");
        auto.setKleur("Fluo geel");
        auto.setKilometerstand(13);
        auto.setAantalDeuren(3);
        auto.drukGegevens();
    }
}
