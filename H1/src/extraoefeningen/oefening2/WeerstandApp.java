package extraoefeningen.oefening2;

import java.util.Scanner;

public class WeerstandApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef char1 in: ");
        char ch1 = sc.next().charAt(0);
        System.out.println("Geef char2 in: ");
        char ch2 = sc.next().charAt(0);
        System.out.println("Geef char3 in: ");
        char ch3 = sc.next().charAt(0);

        Weerstand weerstand  = new Weerstand();
        weerstand.setChar1(ch1);
        weerstand.setChar2(ch2);
        weerstand.setChar3(ch3);

        System.out.println(weerstand.getWeerstandswaarde());
        System.out.println(weerstand.getKleur());
    }

}
