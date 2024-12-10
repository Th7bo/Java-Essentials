package extravoorbeelden.opdracht2;

public class Bewerkingen {

    public static int telOp(int[] getallen) {
        int som = 0;
        for (int i : getallen) {
            som += i;
        }
        return som;
    }

    public static int trekAf(int[] getallen) {
        int verschil = getallen[0];
        for (int i = 1; i < getallen.length; i++) {
            verschil -= getallen[i];
        }
        return verschil;
    }

    public static int product(int[] getallen) {
        int product = 1;
        for (int getal : getallen) {
            product *= getal;
        }
        return product;
    }
}
