package oefeningen.oefening3.weapons;

/**
 * The type Axe.
 */
public class Axe extends Weapon {

    private double sharpness = MAX_SHARPNESS;
    /**
     * The constant MIN_SHARPNESS.
     */
    public static final double MIN_SHARPNESS = 0.2;
    /**
     * The constant MAX_SHARPNESS.
     */
    public static final double MAX_SHARPNESS = 0.8;

    /**
     * Instantiates a new Axe.
     *
     * @param attackPower the attack power
     */
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
