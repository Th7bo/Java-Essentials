package voorbeelden.demo;

import java.util.Scanner;

public class DemoInvoer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef nummer: ");
        int nummer = scanner.nextInt();
        System.out.println("Geef je favoriete film:");
        String film = scanner.next();
        System.out.println("Geef je favoriete acteur:");
        String acteur = scanner.next();
        System.out.println("Geef je favoriete band:");
        String band = scanner.next();
        System.out.println(nummer + ", " + film + ", "
                + acteur + ", " + band);

     }
}
