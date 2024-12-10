package oefeningen.oefening3.characters;

import oefeningen.oefening3.weapons.Axe;
import oefeningen.oefening3.weapons.Sword;
import oefeningen.oefening3.weapons.Weapon;

import java.util.Locale;

public class Warrior extends Human {

    /*
    Deze klasse stelt een krijger voor in de applicatie. De constructor verwacht enkel een naam. Een
    Warrior kan een zwaard of een bijl dragen als wapen.
    Een krijger krijgt standaard een zwaard met 10 aanvalspunten. Dit wapen wordt in de
    constructor ingesteld met behulp van de setWeapon() methode. Deze methode controleert of
    het meegegeven wapen wel degelijk een zwaard of een bijl is. Indien dit niet het geval is wordt
    de boodschap “I only know how to swing swords and axes!” door de krijger gezegd. Als het een
    bijl is, zegt hij “A fine blade” en anders “Aah, a new axe”.
    In de attack() methode roept de krijger wat hij gaat doen voor de aanval: “Attacking <opponent
    name> with my sword!”. Zorg dat het wapen op het einde van de zin ook klopt
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
