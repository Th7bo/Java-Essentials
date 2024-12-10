package voorbeelden.demo;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geef je naam:");
        String naam = input.next();
        System.out.println("Geef je naam nog een keer:");
        String naamNogEens = input.next();
        System.out.println("==:" + (naam == naamNogEens));
        System.out.println("equals:" + naam.equals(naamNogEens));
    }
}


