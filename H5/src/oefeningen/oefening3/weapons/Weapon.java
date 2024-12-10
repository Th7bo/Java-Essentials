package oefeningen.oefening3.weapons;

public abstract class Weapon {

    /*
    Deze klasse vormt de basis voor de wapens en er kunnen geen objecten van worden aangemaakt.
    De constructor verwacht een aantal aanvalspunten (attackPower). De methode doDamage()
    geeft het aantal aanvalspunten terug.
     */

    private int attackPower;

    public Weapon(int attackPower) {
        this.attackPower = attackPower;
    }

    public double doDamage() {
        return attackPower;
    }
}
