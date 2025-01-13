package oefeningen.oefening2;

public class Punt {

    private int x;
    private int y;
    static final int MAXIMUMGROOTTE = 99;

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
        controleer();
    }

    public int berekenAfstand(Punt p) {
        return (int) Math.sqrt((p.x - x) ^ 2 + (p.y - y) ^ 2);
    }

    private void controleer() {
        this.x = Math.min(MAXIMUMGROOTTE, Math.max(0, this.x));
        this.y = Math.min(MAXIMUMGROOTTE, Math.max(0, this.y));
    }

    public String toString() {
        return String.format("[%d, %d]", x, y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        controleer();
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
        controleer();
    }
}