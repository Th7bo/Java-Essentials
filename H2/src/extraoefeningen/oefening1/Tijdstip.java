package extraoefeningen.oefening1;

public class Tijdstip {
    private int seconden;

    public Tijdstip(int uren, int minuten, int seconden) {
        this(seconden + minuten * 60 + uren * 3600);
    }

    public Tijdstip(int seconden) {
        this.seconden = seconden;
        controleerSeconden();
    }

    public Tijdstip(Tijdstip tijdstip) {
        this(tijdstip.seconden);
    }

    private void controleerSeconden() {
        this.seconden %= 24 * 3600;
    }

    public int bepaalUren() {
        return this.seconden / 3600;
    }

    public int bepaalMinuten() {
        return (this.seconden - bepaalUren() * 3600) / 60;
    }

    public int bepaalSeconden() {
        return (this.seconden - bepaalUren() * 3600) - bepaalMinuten() * 60;
    }

    public String formatTijd(int getal) {
        return ((getal < 10) ? "0"+ getal : getal + "");
    }

    public String toStringTechnisch() {
        int uren = this.bepaalUren();
        int minuten = this.bepaalMinuten();
        int seconden = this.bepaalSeconden();
        return formatTijd(uren) + ":" + formatTijd(minuten) + ":" + formatTijd(seconden);
    }

    public void voegUrenToe() {
        voegUrenToe(1);
    }

    public void voegUrenToe(int uren) {
        voegMinutenToe(uren * 60);
    }

    public void voegMinutenToe(int minuten) {
        voegSecondenToe(minuten * 60);
    }

    public void voegSecondenToe(int seconden) {
        this.seconden += seconden;
    }

    public String toStringTijd(boolean english) {
        if (!english) {
            return formatTijd(bepaalUren()) + ":" + formatTijd(bepaalMinuten());
        } else {
            int uren = this.bepaalUren();
            int minuten = this.bepaalMinuten();

            String after = "AM";
            if (uren > 12) {
                after = "PM";
                uren -= 12;
            }

            if (uren == 12) {
                after = "PM (noon)";
            }
            else if (uren == 0) {
                uren = 12;
                after += " (midnight)";
            }

            return formatTijd(uren) + ":" + formatTijd(minuten) + " " + after;
        }
    }
}
