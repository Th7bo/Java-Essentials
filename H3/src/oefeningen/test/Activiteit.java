package oefeningen.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Activiteit {

    private LocalDateTime datum;
    private String naam;

    public Activiteit(LocalDateTime datum, String naam) {
        this.datum = datum;
        this.naam = naam;
    }

    public String toString() {
        return datum.getYear() + "-" + datum.getMonthValue() + "-" + datum.getDayOfMonth() + " ".repeat(5) + naam;
    }

    public LocalDateTime getDatum() {
        return datum;
    }

    public String getNaam() {
        return naam;
    }
}
