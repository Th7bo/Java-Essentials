package oefeningen.oefening3;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;
import java.util.Scanner;

public class TypingGame {

    public static void main(String[] args) {
        Result highscore = FileHandler.readHighscore();
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef je naam in:");
        String name = scanner.nextLine();
        System.out.printf("Welkom %s%n", name);
        System.out.println("Er worden zo dadelijk 5 letters getoond die je zo snel mogelijk moet ingeven.");
        System.out.println("Succes!!");
        if (highscore != null) {
            System.out.println("De huidige highscore:");
            System.out.println(highscore);
        }
        System.out.println("Geef 's' in om te starten.");
        String input = scanner.nextLine();
        if (input.equals("s")) {
            Instant start = Instant.now();
            int score = 0;
            while (score < 5) {
                char letter = (char) ('a' + (random.nextInt(0, 27)));
                System.out.printf("Type: %c%n", letter);
                char inputLetter = scanner.nextLine().charAt(0);
                if (inputLetter == letter) {
                    score++;
                } else {
                    System.out.println("Fout!");
                }
            }
            Instant end = Instant.now();
            long diff = end.toEpochMilli() - start.toEpochMilli();
            Result result = new Result(name, LocalDateTime.now(), diff / 1000.0);
            System.out.println("Resultaat:");
            System.out.println(result);
            if (highscore == null || result.getResult() < highscore.getResult()) {
                FileHandler.writeHighscore(result);
                highscore = result;
                System.out.println("Nieuwe highscore!!");
            }
            System.out.println("Highscore:");
            System.out.println(highscore);
        }
    }

}
