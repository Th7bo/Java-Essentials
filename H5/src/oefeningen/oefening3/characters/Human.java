package oefeningen.oefening3.characters;

import oefeningen.oefening3.weapons.Weapon;

import java.util.ArrayList;

public abstract class Human extends Character {

    /*
    De mensen zijn de hoofdrolspelers in ons verhaal. Van deze klasse kunnen echter niet
    rechtstreeks objecten worden aangemaakt.
    De constructor verwacht enkel een naam (String) als parameter. Een mens start altijd met 100
    levenspunten.
    De klasse bevat een wapen van de mens (Weapon weapon) dat via een getter en een setter
    aangesproken kan worden. Hiernaast bevat de klasse ook een lijst met verslagen vijanden. Zorg
    dat deze lijst correct wordt aangemaakt bij constructie. De lijst mag geen vaste grootte krijgen.
    Tenslotte implementeert deze klasse ook de methode attack(). In deze methode wordt de
    decreaseHealth() van de tegenstander (opponent) opgeroepen met als aantal schadepunten het
    resultaat van doDamage() van het huidige wapen. Indien de vijand verslagen is (health ≤ 0),
    wordt deze toegevoegd aan de lijst van verslagen vijanden (niet meerdere keren dezelfde
    vijand).
     */

    private Weapon weapon;
    private ArrayList<Character> defeatedEnemies = new ArrayList<>();

    public Human(String name) {
        super(name, 100);
    }

    @Override
    public void attack(Character opponent) {
        opponent.decreaseHealth(weapon.doDamage());
        if (!opponent.alive() && !defeatedEnemies.contains(opponent)) defeatedEnemies.add(opponent);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<Character> getDefeatedEnemies() {
        return defeatedEnemies;
    }
}
