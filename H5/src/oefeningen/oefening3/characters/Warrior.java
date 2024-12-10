package oefeningen.oefening3.characters;

import oefeningen.oefening3.weapons.Axe;
import oefeningen.oefening3.weapons.Sword;
import oefeningen.oefening3.weapons.Weapon;

/**
 * The type Warrior.
 */
public class Warrior extends Human {

    /**
     * Instantiates a new Warrior.
     *
     * @param name the name
     */
    public Warrior(String name) {
        super(name);
        setWeapon(new Sword(10));
    }

    @Override
    public void attack(Character opponent) {
        speak("Attacking " + opponent.getName() + " with my " + getWeapon().getClass().getSimpleName().toLowerCase());
        super.attack(opponent);
    }

    @Override
    public void setWeapon(Weapon weapon) {
        if (!(weapon instanceof Sword) && !(weapon instanceof Axe)) {
            speak("I only know how to swing swords and axes!");
            return;
        }
        if (weapon instanceof Sword) {
            speak("A fine blade");
        } else {
            speak("AAh, a new axe");
        }
        super.setWeapon(weapon);
    }
}
