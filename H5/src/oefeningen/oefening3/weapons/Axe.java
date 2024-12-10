package oefeningen.oefening3.weapons;

public class Axe extends Weapon {

    /*
    De bijl is vergelijkbaar met het zwaard, alleen ligt de scherpte tussen 0.1 en 0.8 en slijt de bijl
    slechts 0.02 per aanval.
     */

    private double sharpness = MAX_SHARPNESS;
    public static final double MIN_SHARPNESS = 0.2;
    public static final double MAX_SHARPNESS = 0.8;

    public Axe(int attackPower) {
        super(attackPower);
    }

    @Override
    public double doDamage() {
        double dmg = super.doDamage() * sharpness;
        sharpness = Math.max(MIN_SHARPNESS, sharpness - 0.02);
        return dmg;
    }
}
