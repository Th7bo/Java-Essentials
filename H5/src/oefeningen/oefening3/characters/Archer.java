package oefeningen.oefening3.characters;

import oefeningen.oefening3.weapons.Bow;
import oefeningen.oefening3.weapons.Weapon;

import java.util.Random;

/**
 * The type Archer.
 */
public class Archer extends Human {

    private final static Random random = new Random();

    /**
     * Instantiates a new Archer.
     *
     * @param name Name of the archer
     */
    public Archer(String name) {
        super(name);
        setWeapon(new Bow(10, 5));
    }

    /**
     * Attack an enemy.
     *
     * @param opponent
     * Given victim.
     */
    @Override
    public void attack(Character opponent) {
        speak("Attacking " + opponent.getName() + "with my bow!");
        super.attack(opponent);
    }

    /**
     * Set a weapon.
     *
     * @param weapon
     * Given weapon.
     */
    @Override
    public void setWeapon(Weapon weapon) {
        if (!(weapon instanceof Bow)) {
            speak("I only know how to shoot a bow");
            return;
        }
        speak("A new Bow");
        super.setWeapon(weapon);
    }

    /**
     * Find arrows.
     */
    public void findArrows() {
        int arrows = random.nextInt(1, 11);
        ((Bow) getWeapon()).addArrows(arrows);
    }
}
