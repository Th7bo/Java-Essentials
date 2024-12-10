package voorbeelden.opdracht11;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        BankAccountNumber bankAccountNumber = new BankAccountNumber();
        bankAccountNumber.setCode("BE");
        bankAccountNumber.setControlDigits(68);
        bankAccountNumber.setNumber(539007547034L);
        System.out.println(bankAccountNumber.getAccount());
        if (bankAccountNumber.isValid()) {
            System.out.println("This bank account number is valid.");
        } else {
            System.out.println("This bank account number is not valid.");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef het start bedrag: ");
        double start = scanner.nextDouble();
        bankAccountNumber.setBedrag(start);
        System.out.println("Wil je geld afhalen? (j/n)");
        String answer = scanner.next();
        while (answer.equals("j") && !bankAccountNumber.isLeeg()) {
            System.out.printf("Hoeveel geld wil je afhalen (max. %.2f )? %n", bankAccountNumber.getBedrag());
            double hoeveel = scanner.nextDouble();
            scanner.nextLine();
            bankAccountNumber.haalAf(hoeveel);
            if (!bankAccountNumber.isLeeg()) {
                System.out.println("Wil je geld afhalen? (j/n)");
                answer = scanner.next();
            }
        }

        System.out.printf("Er staat nog %.2f op de rekening %n", bankAccountNumber.getBedrag());
    }
}