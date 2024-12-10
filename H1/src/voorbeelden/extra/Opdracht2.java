package voorbeelden.extra;

import java.util.Scanner;

public class Opdracht2 {
    public static void main(String[] args) {
        System.out.print("Veelvouden: ");
        for (int i = 10; i < 110; i+= 10) {
            System.out.printf("%s ", i);
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef de grootte in: ");
        int grootte = scanner.nextInt();
        System.out.print("Geef de letter in: ");
        char letter = scanner.next().charAt(0);

        for (int i = 0; i < grootte; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.printf("%-3c", letter);
                letter++;
                if (letter > 'Z') {
                    letter = 'A';
                }
            }
            System.out.println();
        }

        StringBuilder alfabet = new StringBuilder();
        for (char letter_alfabet = 'a'; letter_alfabet <= 'z'; letter_alfabet++) {
            alfabet.append(letter_alfabet);
        }
        System.out.println("Alfabet: " + alfabet);

    }
}
