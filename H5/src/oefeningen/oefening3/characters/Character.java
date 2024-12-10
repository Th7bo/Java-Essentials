package oefeningen.oefening3.characters;

/**
 * The type Character.
 */
public abstract class Character {

    private String name;
    private double health;

    /**
     * Create a character.
     *
     * @param name   the name
     * @param health the health
     */
    public Character(String name, double health) {
        this.name = name;
        this.health = health;
    }

    /**
     * Check if the character is alive.
     *
     * @return boolean
     */
    public boolean alive() {
        return health > 0;
    }

    /**
     * Attack.
     *
     * @param opponent the opponent
     */
    public abstract void attack(Character opponent);


    /**
     * Decrease the health of the character.
     *
     * @param amount The amount that the health decreases.
     * @return health double
     */
    public double decreaseHealth(double amount) {
        health = Math.max(health - amount, 0);
        if (health == 0) System.out.printf("%s is dead", name);
        return health;
    }

    /**
     * Gets the name of the character.
     *
     * @return name name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the health of the character.
     *
     * @return health double
     */
    public double getHealth() {
        return health;
    }

    /**
     * Heal double.
     *
     * @param amount The amount that the character heals
     * @return health double
     */
    public double heal(double amount) {
        health = Math.min(health + amount, 100);
        if (health == 100) speak("Feeling great!");
        return health;
    }

    /**
     * Makes a character speak.
     *
     * @param text Text that the character says.
     */
    public void speak(String text) {
        System.out.println(name + ": " + text);
    }
}
