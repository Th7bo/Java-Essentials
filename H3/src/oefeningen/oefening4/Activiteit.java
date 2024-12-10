package oefeningen.oefening4;

import java.time.LocalDate;

public class Activiteit {

    private LocalDate datum;
    private String naam;

    public Activiteit(LocalDate datum, String naam) {
        this.datum = datum;
        this.naam = naam;
    }

    public String toString() {
        return datum.getYear() + "-" + datum.getMonthValue() + "-" + datum.getDayOfMonth() + " ".repeat(5) + naam;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public String getNaam() {
        return naam;
    }
}
