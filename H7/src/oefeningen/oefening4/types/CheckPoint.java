package oefeningen.oefening4.types;

public final class CheckPoint extends Room {

    private int valueNeeded;

    public CheckPoint(String name, int value) {
        super(name);
        this.valueNeeded = value;
    }

    public boolean checkPointControl(Player player) {
        return player.isTotalValueSufficient(valueNeeded);
    }

}
