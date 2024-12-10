package oefeningen.oefening2;

import java.util.ArrayList;

public class MuntApp {

    public static void main(String[] args) {
        ArrayList<Munt> munten  = new ArrayList<>();

        munten.add(new Munt("britse pond", 0.985));
        munten.add(new Munt("dollar", 1.287));
        munten.add(new Munt("russische roebel", 86.950));
        munten.add(new Munt());

        for (Munt m : munten) {
            System.out.printf("%." + Munt.getAfronding() + "f %s%n", m.getKoers(), m.getNaam());
        }

        Munt eerste = munten.getFirst();
        System.out.printf("Overzicht koersen tov %s: 1 %s =%n", eerste.getNaam(), eerste.getNaam());
        for (Munt m : munten.subList(1, munten.size())) {
            System.out.printf("%." + Munt.getAfronding() + "f %s%n", m.getKoersTov(eerste), m.getNaam());
        }
    }

}
