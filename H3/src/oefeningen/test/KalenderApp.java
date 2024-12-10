package oefeningen.test;

import java.time.LocalDateTime;

public class KalenderApp {

    public static void main(String[] args) {
        Kalender kalender = new Kalender();
        kalender.addActiviteit(LocalDateTime.now().plusDays(1), "a1");
        kalender.addActiviteit(LocalDateTime.now().plusDays(2), "a2");
        kalender.addActiviteit(LocalDateTime.now().plusDays(3), "a3");
        kalender.addActiviteit(LocalDateTime.now().plusDays(4), "a4");


        kalender.getNextActiviteit(LocalDateTime.now().plusDays(2).plusMinutes(1));
    }

}
