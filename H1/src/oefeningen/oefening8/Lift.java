package oefeningen.oefening8;

public class Lift {

    private int aantalVerdiepen;
    private int verdieping;
    private int maxPersonen;
    private int aantalPersonen;

    public void betreed(int personen) {
        setAantalPersonen(aantalPersonen + personen);
    }

    public void verlaat(int personen) {
        setAantalPersonen(aantalPersonen - personen);
    }

    private void printVerdiep(int verdiep) {
        System.out.println("---");
        System.out.printf("|%s| %n", verdiep);
        System.out.println("---");
    }

    public int getAantalVerdiepen() {
        return aantalVerdiepen;
    }

    public void setAantalVerdiepen(int aantalVerdiepen) {
        this.aantalVerdiepen = aantalVerdiepen;
    }

    public void gaNaar(int verdiep) {
        if (aantalPersonen == 0) {
            printVerdiep(verdieping);
            return;
        }

        if (verdiep == verdieping) {
            printVerdiep(verdieping);
            return;
        }

        int step = (verdiep > verdieping) ? 1 : -1;

        for (int i = 0; i != verdiep - verdieping + step; i += step) {
            printVerdiep(verdieping + i);
        }

        setVerdieping(verdiep);
    }

    public int getVerdieping() {
        return verdieping;
    }

    public void setVerdieping(int verdieping) {
        if (verdieping > aantalVerdiepen) {
            verdieping = aantalVerdiepen;
        } else if (verdieping < 0) {
            verdieping = 0;
        }
        this.verdieping = verdieping;
    }

    public int getMaxPersonen() {
        return maxPersonen;
    }

    public void setMaxPersonen(int maxPersonen) {
        this.maxPersonen = maxPersonen;
    }

    public int getAantalPersonen() {
        return aantalPersonen;
    }

    public void setAantalPersonen(int aantalPersonen) {
        if (aantalPersonen > maxPersonen) {
            aantalPersonen = maxPersonen;
        } else if (aantalPersonen < 0) {
            aantalPersonen = 0;
        }
        this.aantalPersonen = aantalPersonen;
    }
}
