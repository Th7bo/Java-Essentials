package oefeningen;

import java.util.Scanner;

public class Input {

    private static Scanner scanner;
    private static Scanner getScanner() {
        if (scanner == null) scanner = new Scanner(System.in);
        return scanner;
    }

    public static String getLine() {
        return getScanner().nextLine();
    }

    public static String getLine(String prompt) {
        System.out.print(prompt);
        return getLine();
    }

    public static int getInt() {
        int value = getScanner().nextInt();
        getScanner().nextLine();
        return value;
    }

    public static int getInt(String prompt) {
        System.out.print(prompt);
        return getInt();
    }

}
