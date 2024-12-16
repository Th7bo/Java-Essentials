package oefeningen.oefening5;

public enum TShirtSize {

    extra_smal(86, "XS"), smal(94, "S"), medium(102, "M"),
    large(110, "L"), extra_large(118, "XL"),
    extra_extra_large(128, "XXL"), extra_extra_extra_large(140, "3XL");

    private int maxBorstOmtrek;
    private String korteNotatie;

    private TShirtSize(int maxBorstOmtrek, String korteNotatie) {
        this.maxBorstOmtrek = maxBorstOmtrek;
        this.korteNotatie = korteNotatie;
    }

    public int getMaxBorstOmtrek() {
        return maxBorstOmtrek;
    }

    public String getKorteNotatie() {
        return korteNotatie;
    }
}
