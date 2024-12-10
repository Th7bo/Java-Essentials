package oefeningen.oefening3.weapons;

public class Bow extends Weapon {

    /*
    De boog is het derde soort wapen. De constructor krijgt naast de aanvalspunten ook een aantal
    van pijlen (numArrows) mee.
    In de doDamage() methode moeten we natuurlijk het aantal pijlen controleren voordat we de
    schade teruggeven. Na elk schot vermindert het aantal pijlen met 1. Indien er geen pijlen zijn,
    komt er een boodschap “Out of arrows” in de console en wordt 0 teruggegeven. De methode
    hier heeft dezelfde return als de methode doDamage() van de superklasse.
    Het aantal pijlen kan aangevuld worden met behulp van de methode addArrows(int
    numArrowsFound).
     */

    private int numArrows;


    public Bow(int attackPower, int numArrows) {
        super(attackPower);
        this.numArrows = numArrows;
    }

    public void addArrows(int numArrowsFound) {
        this.numArrows += numArrowsFound;
    }

    @Override
    public double doDamage() {
        if (numArrows > 0) {
            numArrows -= 1;
            return super.doDamage();
        }
        System.out.println("Out of arrows");
        return 0;
    }

    public int getNumArrows() {
        return numArrows;
    }
}
