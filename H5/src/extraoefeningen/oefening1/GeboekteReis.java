package extraoefeningen.oefening1;

import java.util.ArrayList;

public class GeboekteReis {

    private String name;
    private Reis[] reizen;

    public GeboekteReis(String name, int aantal) {
        this.name = name;
        reizen = new Reis[aantal];
    }

    private int getFirstEmpty() {
        for (int i = 0; i < reizen.length; i++) {
            if (reizen[i] == null) return i;
        }
        return -1;
    }

    private int getSize() {
        int size = 0;
        for (int i = 0; i < reizen.length; i++) {
            if (reizen[i] != null) size++;
        }
        return size;
    }

    public void voegReisToe(Reis r) {
        if (getFirstEmpty() == -1) return;
        reizen[getFirstEmpty()] = r;
    }

    public void print() {
        System.out.printf("Reis van %s%n", name);
        for (int i = 0; i < reizen.length; i++) {
            Reis reis = reizen[i];
            if (reis == null) continue;
            System.out.printf("==> reis %d %s%n", i + 1, reis);
        }
        System.out.printf("Deze persoon moet %d keer overstappen%n", getSize() - 1);
    }

}
