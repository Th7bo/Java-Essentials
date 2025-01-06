package opdrachten.opdracht1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef een getal in:");
        String input = sc.next();
        Integer test = Integer.valueOf(input);
        System.out.println(test);
        test += 5;
        System.out.println(test);
        System.out.printf("Voor een Integer worden er %d bits gebruikt.%n", Integer.SIZE);
        System.out.printf("Voor een Integer worden er %d bytes gebruikt.%n", Integer.BYTES);
        // extra
        ArrayList<Integer> lijst = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            lijst.add(i);
        }
        lijst.set(0, lijst.getFirst() * 5);
        System.out.println(lijst);
    }

}
