package extraoefeningen.oefening2;

import java.util.ArrayList;

public class GsmApp {

    public static void main(String[] args) {
        ArrayList<Gsm> gsms = new ArrayList<>();
        Gsm gsm = new Gsm("0123456789", "Apple");
        gsms.add(gsm);
        gsm = new Gsm("0123456789", "Banana");
        gsms.add(gsm);
        gsm = new Gsm("012456789", "Test");
        gsms.add(gsm);
        gsm = new Gsm();
        gsms.add(gsm);

        for (Gsm g : gsms) {
            g.setVoornaamEigenaar("Thibo");
            g.toonGSM();
        }
    }

}
