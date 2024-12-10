package oefeningen.oefening3.weapons;

public class Sword extends Weapon {

    /*
    Dit wapen heeft als speciale kenmerk de scherpte van het lemmet. Dit is een waarde tussen 0.2
    en 1.0. Bij het oproepen van de doDamage() methode moet het product van deze scherpte en de
    aanvalspunten worden teruggegeven. Elk zwaard start met de scherpte 1.0. Na elk gebruik wordt
    het mes botter wegens slijtage en wordt de scherpte met 0.1 verminderd. Zorg dat de waarde
    nooit lager dan de minimumwaarde van 0.2 gaat.
     */

    private double sharpness = MAX_SHARPNESS;
    public static final double MIN_SHARPNESS = 0.2;
    public static final double MAX_SHARPNESS = 1;

    public Sword(int attackPower) {
        super(attackPower);
    }

    @Override
    public double doDamage() {
        double dmg = super.doDamage() * sharpness;
        sharpness = Math.max(MIN_SHARPNESS, sharpness - 0.1);
        return dmg;
    }
}
