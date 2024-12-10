package oefeningen.oefening4;

import java.util.Scanner;

public class HotelApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geef het aantal volwassenen in: ");
        int volwassenen = sc.nextInt();
        System.out.print("Geef het aantal kinderen in: ");
        int kinderen = sc.nextInt();
        System.out.print("Geef de hotelcode: ");
        String hotelcode = sc.next();
        StringBuilder builder = new StringBuilder();
        while (!hotelcode.equalsIgnoreCase("/")) {
            Hotel hotel = new Hotel();
            hotel.setHotelCode(hotelcode);
            System.out.print("Geef het aantal sterren: ");
            int sterren = sc.nextInt();
            hotel.setSterren(sterren);
            System.out.print("Geef een kindercode: ");
            char kindercode = sc.next().charAt(0);
            hotel.setKindercode(kindercode);

            builder.append(String.format("%s%5s %.2f %.2f %.2f %n", hotelcode, hotel.getSterren(), hotel.getPrijs(), hotel.getPrijsKind(), volwassenen * hotel.getPrijs() + kinderen * hotel.getPrijsKind()));

            System.out.print("Geef de hotelcode: ");
            hotelcode = sc.next();
        }
        System.out.println(builder);
    }

}
