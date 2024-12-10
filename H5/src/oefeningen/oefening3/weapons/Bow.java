package oefeningen.oefening3.weapons;

/**
 * The type Bow.
 */
public class Bow extends Weapon {

    private int numArrows;


    /**
     * Instantiates a new Bow.
     *
     * @param attackPower the attack power
     * @param numArrows   the num arrows
     */
    public Bow(int attackPower, int numArrows) {
        super(attackPower);
        this.numArrows = numArrows;
    }

    /**
     * Add arrows.
     *
     * @param numArrowsFound the num arrows found
     */
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

    /**
     * Gets num arrows.
     *
     * @return the num arrows
     */
    public int getNumArrows() {
        return numArrows;
    }
}
