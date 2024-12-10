package oefeningen.oefening3.characters;

/**
 * The type Monster.
 */
public class Monster extends Character {

    private double attackPower;

    /**
     * Instantiates a new Monster.
     *
     * @param name  the name
     * @param power the power
     */
    public Monster(String name, double power) {
        super(name, 50);
        this.attackPower = power;
    }

    @Override
    public void attack(Character opponent) {
        speak("Attacking " + opponent.getName());
        opponent.decreaseHealth(attackPower);
    }

    public String toString() {
        return getName();
    }
}
