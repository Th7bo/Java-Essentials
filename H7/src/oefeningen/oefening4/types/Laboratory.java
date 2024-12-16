package oefeningen.oefening4.types;

public class Laboratory extends Room {

    private Item fromItem;
    private Item toItem;

    public Laboratory(String name, Item fromItem, Item toItem) {
        super(name);
        this.fromItem = fromItem;
        this.toItem = toItem;
    }

    @Override
    public String getInstructions() {
        return super.getInstructions() + "TRANSFORM " + fromItem + " -> " + toItem;
    }

    public void transform(Player player) {
        player.replaceItem(fromItem, toItem);
    }
}
