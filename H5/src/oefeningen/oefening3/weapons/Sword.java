package oefeningen.oefening3.weapons;

/**
 * The type Sword.
 */
public class Sword extends Weapon {

    private double sharpness = MAX_SHARPNESS;
    /**
     * The constant MIN_SHARPNESS.
     */
    public static final double MIN_SHARPNESS = 0.2;
    /**
     * The constant MAX_SHARPNESS.
     */
    public static final double MAX_SHARPNESS = 1;

    /**
     * Instantiates a new Sword.
     *
     * @param attackPower the attack power
     */
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
