package oefeningen.oefening4;

public class Hotel {

    private String hotelCode;
    private int sterren;
    private char kindercode;

    public double getPrijs() {
        double prijs;
        if (hotelCode.equals("HI")) {
            prijs = 70;
        } else if (sterren >= 4) {
            prijs = 60;
        } else if (sterren == 3) {
            if (hotelCode.equals("BR") || hotelCode.equals("AN")) {
                prijs = 60;
            } else {
                prijs = 56;

            }
        } else {
            prijs = 48;
        }
        return prijs;
    }

    public double getPrijsKind() {
        double prijs;
        if (kindercode == 'A' && (sterren <= 2 || hotelCode.equals("HA"))) {
            prijs = 0;
        } else {
            prijs = (getPrijs() * 0.5);
        }
        return prijs;
    }


    public String getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(String hotelCode) {
        this.hotelCode = hotelCode;
    }

    public String getSterren() {
        return "*".repeat(sterren); // "x" * sterren
    }

    public void setSterren(int sterren) {
        this.sterren = sterren;
    }

    public char getKindercode() {
        return kindercode;
    }

    public void setKindercode(char kindercode) {
        if (kindercode < 'A') {
            kindercode = 'A';
        } else if (kindercode > 'Z') {
            kindercode = 'Z';
        }
        this.kindercode = kindercode;
    }
}
