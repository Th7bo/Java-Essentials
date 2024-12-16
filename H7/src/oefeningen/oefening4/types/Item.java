package oefeningen.oefening4.types;

public class Item {

    private String name;
    private int value;

    public Item(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String toString() {
        return String.format("%s (%d)", name, value);
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
