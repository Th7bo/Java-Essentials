package oefeningen.oefening3.characters;

import oefeningen.oefening3.weapons.Bow;
import oefeningen.oefening3.weapons.Weapon;

import java.util.Random;

public class Archer extends Human {

    /*
    Deze klasse stelt een menselijk karakter voor dat enkel met een boog kan schieten. Zijn
    constructor verwacht een naam.
    Een boogschutter krijgt standaard een boog met 10 aanvalspunten en 5 pijlen. Dit wapen wordt
    in de constructor ingesteld met behulp van de setWeapon() methode. In deze methode wordt
    gecontroleerd of het wapen dat de boogschutter gaat gebruiken wel degelijk een boog is. Indien
    dit niet het geval is, zegt de boogschutter (methode speak()): “I only know how to shoot a bow”.
    Als het wel een boog is, zegt hij “A new Bow” en wordt het wapen op boog gezet.
    De boogschutter kan ook pijlen zoeken, met de findArrows() methode. De boogschutter vindt
    altijd willekeurig tussen de 1 en 10 pijlen en voegt deze toe aan zijn huidige wapen (dit is altijd
    een boog).
    In de attack() methode roept de boogschutter wat hij gaat doen voor de aanval: “Attacking
    <opponent name> with my bow!”. (gebruik ook hier de speak() methode) De controle van het
    aantal pijlen gebeurt reeds in de doDamage() methode van zijn boog
     */

    private final static Random random = new Random();

    public Archer(String name) {
        super(name);
        setWeapon(new Bow(10, 5));
    }

    @Override
    public void attack(Character opponent) {
        speak("Attacking " + opponent.getName() + "with my bow!");
        super.attack(opponent);
    }

    @Override
    public void setWeapon(Weapon weapon) {
        if (!(weapon instanceof Bow)) {
            speak("I only know how to shoot a bow");
            return;
        }
        speak("A new Bow");
        super.setWeapon(weapon);
    }

    public void findArrows() {
        int arrows = random.nextInt(1, 11);
        ((Bow) getWeapon()).addArrows(arrows);
    }
}
