package oefeningen.oefening5;

public class Spaceship {

    private String name;
    private int hits;
    private boolean shieldOn;

    public void setShieldOn(boolean shieldOn) {
        this.shieldOn = shieldOn;
        if (shieldOn) System.out.println(this.name + " puts shield on");
        else System.out.println(this.name + " puts shield off");
    }

    public void fire(Spaceship spaceship) {
        if (spaceship.shieldOn) this.hits++;
        else spaceship.hits++;
        System.out.printf("%s fires at %s %n", this.name, spaceship.name);
    }

    public boolean isDestroyed() {
        return this.hits >= 5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHits() {
        return hits;
    }

    public boolean isShieldOn() {
        return shieldOn;
    }
}
