package oefeningen.oefening3.characters;

public class Monster extends Character {

    /*
    De tegenstander van de mensen zijn monsters. Bekijk in het klassendiagram hoe deze klasse is
    samengesteld.
    De constructor verwacht een naam (String) en de kracht van zijn aanval (double). Elk monster
    start altijd met 50 levenspunten.
    In de attack() methode valt het monster een tegenstander aan, het monster zegt hierbij
    “Attacking <<targetName>>”, hierdoor vermindert ook het aantal levenspunten van het target.
    De toString() methode geeft de naam van het monster terug.
     */

    private double attackPower;

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
