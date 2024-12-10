package extraoefeningen.oefening3;

import java.util.Scanner;

public class DeelnemerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef het aantal deelnemers in: ");
        int aantal = scanner.nextInt();
        Deelnemer[] deelnemers = new Deelnemer[aantal];
        scanner.nextLine();
        for (int i = 1; i <= aantal; i++) {
            System.out.printf("Geef de naam van deelnemer %d %n", i);
            String naam = scanner.nextLine();
            Deelnemer deelnemer = new Deelnemer();
            deelnemer.setNaam(naam);
            deelnemer.init(aantal);
            deelnemers[i - 1] = deelnemer;
        }

        for (Deelnemer deelnemer1 : deelnemers) {
            System.out.printf("Punten voor %s %n", deelnemer1.getNaam());
            for (Deelnemer deelnemer2 : deelnemers) {
                if (deelnemer1.equals(deelnemer2)) continue;
                System.out.printf("%s geef uw punten voor SFEER: %n", deelnemer2.getNaam());
                int sfeer = scanner.nextInt();
                while (sfeer < 0 || sfeer > 10) {
                    System.out.println("Foute ingave!");
                    System.out.printf("%s geef uw punten voor SFEER: %n", deelnemer2.getNaam());
                    sfeer = scanner.nextInt();
                }

                System.out.printf("%s geef uw punten voor ETEN: %n", deelnemer2.getNaam());
                int eten = scanner.nextInt();
                while (eten < 0 || eten > 10) {
                    System.out.println("Foute ingave!");
                    System.out.printf("%s geef uw punten voor ETEN: %n", deelnemer2.getNaam());
                    eten = scanner.nextInt();
                }

                deelnemer1.addEtenPunten(eten);
                deelnemer1.addSfeerPunten(sfeer);
            }
        }
        int hoogste = 0;
        Deelnemer hoogsteDeelnemer = null;

        for (Deelnemer deelnemer : deelnemers) {
            int score = deelnemer.getScore();
            if (score > hoogste) {
                hoogsteDeelnemer = deelnemer;
                hoogste = score;
            }
            System.out.printf("%s = %d%n", deelnemer.getNaam(), score);
        }
        System.out.printf("Winnaar: %s%n", hoogsteDeelnemer.getNaam());

    }
}
