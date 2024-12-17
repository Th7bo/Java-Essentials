package oefeningen.oefening2;

import java.util.ArrayList;

public class SportApp {

    public static void main(String[] args) {
        ArrayList<Sporter> sporters = new ArrayList<>();
        sporters.add(new Voetballer("Thibo", "Franssen1"));
        sporters.add(new Voetballer("Thibo", "Franssen2"));
        sporters.add(new Voetballer("Thibo", "Franssen3"));
        sporters.add(new Voetballer("Thibo", "Franssen4"));
        sporters.add(new Voetballer("Thibo", "Franssen5"));

        sporters.add(new Voetballer("Thibo", "Franssen6", "abc", "doelman"));
        sporters.add(new Voetballer("Thibo", "Franssen7", "abc", "test"));
        sporters.add(new Voetballer("Thibo", "Franssen8", "abc", "middenvelder"));
        sporters.add(new Voetballer("Thibo", "Franssen9", "abc", "aanvaller"));
        sporters.add(new Voetballer("Thibo", "Franssen10", "abc", "awda"));

        sporters.add(new Sporter("Thibo", "Franssen", "Tennis"));
        sporters.add(new Sporter("Thibo", "Franssen", "Paddel"));
        sporters.add(new Sporter("Thibo", "Franssen", "Squash"));

        System.out.println("Overzicht sporters (behalve voetballers)");
        for (Sporter sporter : sporters) {
            if (!(sporter instanceof Voetballer)) {
                sporter.print();
            }
        }
        System.out.println("Overzicht voetballers volgens opstelling");
        for (String opstelling : Voetballer.getGeldigeOpstellingen()) {
            System.out.printf("*** %s ***%n", opstelling);
            for (Sporter sporter : sporters) {
                if (sporter instanceof Voetballer) {
                    if (((Voetballer) sporter).getOpstelling().equals(opstelling)) sporter.print();
                }
            }
        }
    }

}
