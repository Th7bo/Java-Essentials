package oefeningen.oefening4.types;

import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Item> items = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public int getTotalValue() {
        int totalValue = 0;
        for (Item item : items) {
            if (item == null) continue;
            totalValue += item.getValue();
        }
        return totalValue;
    }

    public boolean isTotalValueSufficient(int value) {
        return getTotalValue() >= value;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void replaceItem(Item oldItem, Item newItem) {
        if (items.contains(oldItem))
            items.set(items.indexOf(oldItem), newItem);
        else
            System.out.println("Item not found.");
    }

    public String getName() {
        return name;
    }

    public void displayItems() {
        StringBuilder sb = new StringBuilder();
        sb.append("+".repeat(7)).append(" ITEMS COLLECTED ").append("+".repeat(7)).append("\n");
        items.forEach(item -> sb.append(item).append("\n"));
        sb.append("Total value: ").append(getTotalValue()).append("\n");
        sb.append("+".repeat(31));
        System.out.println(sb);
    }
}
