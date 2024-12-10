package oefeningen.oefening3.weapons;

/**
 * The type Weapon.
 */
public abstract class Weapon {

    private int attackPower;

    /**
     * Instantiates a new Weapon.
     *
     * @param attackPower the attack power
     */
    public Weapon(int attackPower) {
        this.attackPower = attackPower;
    }

    /**
     * Do damage double.
     *
     * @return the double
     */
    public double doDamage() {
        return attackPower;
    }
}
