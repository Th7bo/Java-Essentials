package oefeningen.oefening4;

import java.util.Scanner;

public class Input {

    private static Scanner scanner;
    public static Scanner getScanner() {
        if (scanner == null) scanner = new Scanner(System.in);
        return scanner;
    }

    public static String readLine() {
        return getScanner().nextLine();
    }

    public static String readLine(String prompt) {
        System.out.println(prompt);
        return readLine();
    }

    public static int readInt() {
        return getScanner().nextInt();
    }

    public static int readInt(String prompt) {
        System.out.println(prompt);
        return readInt();
    }

}
