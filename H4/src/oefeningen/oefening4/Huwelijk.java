package oefeningen.oefening4;

import java.time.LocalDate;

public class Huwelijk {

    private Persoon partner1;
    private Persoon partner2;
    private LocalDate huwelijksDatum;

    public Huwelijk(Persoon partner1, Persoon partner2, int dag, int maand, int jaar) {
        this.partner1 = partner1;
        this.partner2 = partner2;
        this.huwelijksDatum = LocalDate.of(jaar, maand, dag);
        partner2.setAdres(partner1.getAdres());
        System.out.printf("%s %s en %s %s zijn gehuwd op %02d %s %d. Proficiat!%n", partner1.getVoornaam(), partner1.getNaam(), partner2.getVoornaam(), partner2.getNaam(), huwelijksDatum.getDayOfMonth(), huwelijksDatum.getMonth().name().toLowerCase(), huwelijksDatum.getYear());
    }

    public void adresWijziging(String straat, String huisnummer, int postcode, String gemeente) {
        Adres adres = new Adres(straat, huisnummer, postcode, gemeente);
        partner1.setAdres(adres);
        partner2.setAdres(adres);
    }
    public void print() {
        System.out.println(partner1 + System.lineSeparator().repeat(2) + partner2 + System.lineSeparator().repeat(2) +
                String.format("Het huwelijk vond plaats op %02d %s %d", huwelijksDatum.getDayOfMonth(), huwelijksDatum.getMonth().name(), huwelijksDatum.getYear()));
    }

    public Persoon getPartner1() {
        return partner1;
    }

    public void setPartner1(Persoon partner1) {
        this.partner1 = partner1;
    }

    public Persoon getPartner2() {
        return partner2;
    }

    public void setPartner2(Persoon partner2) {
        this.partner2 = partner2;
    }

    public LocalDate getHuwelijksDatum() {
        return huwelijksDatum;
    }

    public void setHuwelijksDatum(LocalDate huwelijksDatum) {
        this.huwelijksDatum = huwelijksDatum;
    }
}
