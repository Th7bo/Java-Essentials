package oefeningen.oefening3.characters;

public abstract class Character {

    /*
    Deze klasse wordt gebruikt als basis voor zowel de Human als de Monster klasse.
    De constructor krijgt een naam en een aantal levenspunten (health) mee. Deze waarden kunnen
    opgevraagd worden, maar er is geen setter.
    De klasse bevat een abstracte methode attack(Character opponent).
    Daarnaast bevat de klasse nog drie belangrijke methodes:
    • void speak(String text): Bij het oproepen van deze methode print het character zijn
    naam af naar de console, gevolgd door een ‘:’ en de meegegeven tekst.
    • double decreaseHealth(double damage): Deze methode krijgt een aantal schadepunten
    mee als parameter. Deze schade wordt toegebracht aan het huidige Character. Voer de
    schade uit door het aantal levenspunten te verminderen. Als de levenspunten op nul
    komen te staan, wordt er “<naam> is dead” naar de console geprint. De levenspunten
    mogen nooit onder nul gaan.
    Deze functie geeft tenslotte het overgebleven aantal levenspunten terug.
    • double heal(double additionalHealth): Deze methode telt een aantal levenspunten op bij
    het huidige aantal. Let op: dit aantal mag nooit meer dan 100 zijn na het uitvoeren van
    deze methode. Indien dit maximum wordt bereikt, zegt het karakter: “Feeling great!”.
    Deze methode retourneert het aantal levenspunten.
    • alive(): deze methode returnt true als het aantal levenspunten > 0
     */

    private String name;
    private double health;

    public Character(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public boolean alive() {
        return health > 0;
    }

    public abstract void attack(Character opponent);

    public double decreaseHealth(double amount) {
        health = Math.max(health - amount, 0);
        if (health == 0) System.out.printf("%s is dead", name);
        return health;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public double heal(double amount) {
        health = Math.min(health + amount, 100);
        if (health == 100) speak("Feeling great!");
        return health;
    }

    public void speak(String text) {
        System.out.println(name + ": " + text);
    }
}
