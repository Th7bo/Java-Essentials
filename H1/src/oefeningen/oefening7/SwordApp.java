package oefeningen.oefening7;

import java.util.ArrayList;
import java.util.List;

public class SwordApp {

    public static void main(String[] args) {
        Sword[] swords = new Sword[3];
        Sword wood = new Sword(MaterialType.WOOD);
        wood.setMaterial("Wood");
        wood.setDurability(33);
        swords[0] = wood;

        Sword stone = new Sword();
        stone.setMaterial("Stone");
        stone.setDurability(500);
        swords[1] = stone;

        Sword diamond = new Sword();
        diamond.setMaterial("Diamond");
        diamond.setDurability(1500);
        swords[2] = diamond;

        Sword durable = null;
        int durability = 0;
        for (Sword sword : swords) {
            if (sword.getDurability() >= durability) {
                durability = sword.getDurability();
                durable = sword;
            }
        }

        System.out.printf("Most durable sword is %s %n", durable != null ? durable.getMaterial() : "");
        System.out.printf("|%10s|%12s| %n", "Materiaal", "Durability");
        for (Sword sword : swords) {
            System.out.printf("|%10s|%12s| %n", sword.getMaterial(), sword.getDurability());
        }
    }

}
