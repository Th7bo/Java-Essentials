package oefeningen.oefening7;

public class Sword {

    private String material;
    private int durability;

    public Sword(MaterialType type) {
        this.material = type.getMaterialName();
        this.durability = type.getDurability();
    }

    public Sword() {}

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}
