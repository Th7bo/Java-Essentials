package oefeningen.oefening4.types;

public class TreasureRoom extends Room {

    private boolean available;
    private Item item;

    public TreasureRoom(String name, Item item) {
        super(name);
        this.available = true;
        this.item = item;
    }

    public String toString() {
        return super.toString() + (available ? "*" : "");
    }

    public void takeItem(Player player) {
        if (available) {
            player.addItem(item);
            available = false;
        }
    }

    @Override
    public String getInstructions() {
        return super.getInstructions() + (available ? "TAKE " + item : "");
    }
}
