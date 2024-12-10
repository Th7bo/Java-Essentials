package oefeningen.oefening7;

public enum MaterialType {
    WOOD(59),
    STONE(131),
    IRON(250),
    GOLD(32),
    DIAMOND(1561),
    NETHERITE(2031);

    private final int durability;

    MaterialType(int durability) {
        this.durability = durability;
    }

    public int getDurability() {
        return durability;
    }

    public String getMaterialName() {
        return name();
    }
}
