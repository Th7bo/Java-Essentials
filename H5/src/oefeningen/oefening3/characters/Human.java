package oefeningen.oefening3.characters;

import oefeningen.oefening3.weapons.Weapon;

import java.util.ArrayList;

/**
 * The type Human.
 */
public abstract class Human extends Character {

    private Weapon weapon;
    private ArrayList<Character> defeatedEnemies = new ArrayList<>();

    /**
     * Instantiates a new Human.
     *
     * @param name the name
     */
    public Human(String name) {
        super(name, 100);
    }

    @Override
    public void attack(Character opponent) {
        opponent.decreaseHealth(weapon.doDamage());
        if (!opponent.alive() && !defeatedEnemies.contains(opponent)) defeatedEnemies.add(opponent);
    }

    /**
     * Gets weapon.
     *
     * @return the weapon
     */
    public Weapon getWeapon() {
        return weapon;
    }

    /**
     * Sets weapon.
     *
     * @param weapon the weapon
     */
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    /**
     * Gets defeated enemies.
     *
     * @return the defeated enemies
     */
    public ArrayList<Character> getDefeatedEnemies() {
        return defeatedEnemies;
    }
}
