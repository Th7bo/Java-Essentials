package extraoefeningen.oefening1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TeVerkopenBouwGrond extends Bouwgrond {

    private String notaris;
    private LocalDate datumTeKoop;
    private double hoogsteBod;
    private LocalDate datumHoogsteBod;

    public TeVerkopenBouwGrond(String perceelNummer, double perceelGrootte, String bouwVoorschrift) {
        super(perceelNummer, perceelGrootte);
        setBouwVoorschrift(bouwVoorschrift);
    }

    @Override
    public void wijsEenNotarisToe(String naam, LocalDate datum) {
        if (notaris != null) return;
        this.notaris = naam;
        this.datumTeKoop = datum;
    }

    @Override
    public void doeEenBod(double prijs, LocalDate datum) {
        if (notaris == null) {
            System.out.println("Er is nog geen notaris aan de bouwgrond toegekend!");
            return;
        }
        if (datumTeKoop.plusDays(10).isAfter(datum)) {
            System.out.println("Er zijn nog geen 10 dagen gepasseerd nadat de bouwgrond te koop is gesteld!");
            return;
        }

        double prijsPerM2 = prijs / super.getPerceelGrootte();

        if (prijsPerM2 < MIN_PRIJS_M2) {
            System.out.println("De prijs per M2 is te laag!");
            return;
        }
        // woensdag 07 december 2022
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yy");

        System.out.printf("Perceelnummer: %s%n", getPerceelNummer());
        System.out.printf("Perceelgrootte: %.2f are%n", getPerceelGrootte());
        System.out.printf("Bouwvoorschrift: %s%n", getBouwVoorschrift());
        System.out.printf("Te koop gesteld op %s bij notaris %s%n", datumTeKoop.format(formatter), notaris);

        if (hoogsteBod >= 0.0 && datumHoogsteBod != null) {
            System.out.printf("Vorig hoogste bod %.0f geregistreerd op %s%n", hoogsteBod, datumHoogsteBod.format(dateTimeFormatter));
        }
        hoogsteBod = prijs;
        datumHoogsteBod = datum;
        System.out.printf("Nieuw hoogste bod %.0f geregistreerd op %s%n", hoogsteBod, datumHoogsteBod.format(dateTimeFormatter));
    }

    public String getNotaris() {
        return notaris;
    }

    public LocalDate getDatumTeKoop() {
        return datumTeKoop;
    }

    public double getHoogsteBod() {
        return hoogsteBod;
    }

    public void setHoogsteBod(double hoogsteBod) {
        this.hoogsteBod = hoogsteBod;
    }

    public LocalDate getDatumHoogsteBod() {
        return datumHoogsteBod;
    }

    public void setDatumHoogsteBod(LocalDate datumHoogsteBod) {
        this.datumHoogsteBod = datumHoogsteBod;
    }
}
