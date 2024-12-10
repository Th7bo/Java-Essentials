package oefeningen.test;

import oefeningen.test.Activiteit;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Kalender {

    private ArrayList<Activiteit> activiteiten = new ArrayList<>();

    public void addActiviteit(Activiteit activiteit) {
        activiteiten.add(activiteit);
    }

    public void addActiviteit(LocalDateTime date, String name) {
        activiteiten.add(new Activiteit(date, name));
    }

    public void getNextActiviteit(LocalDateTime now) {
        Activiteit activiteit = activiteiten.stream()
                .filter(item -> !item.getDatum().isBefore(now) && !item.getDatum().isEqual(now))
                .min(Comparator.comparingLong(item -> Math.abs(item.getDatum().toEpochSecond(ZoneOffset.UTC) - now.toEpochSecond(ZoneOffset.UTC))))
                .orElse(null);
        System.out.println("Next activiteit: " + activiteit);
    }

}
