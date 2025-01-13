package oefeningen.oefening2;

import java.util.Arrays;

public final class Voetballer extends Sporter {

    private String club;
    private String opstelling;
    private static final String[] GELDIGE_OPSTELLINGEN = new String[]{"middenvelder", "aanvaller", "verdediger", "onbepaald"};

    public Voetballer(String naam, String voornaam) {
        this(naam, voornaam, "onbepaald", "onbepaald");
    }

    public Voetballer(String naam, String voornaam, String club, String opstelling) {
        super(naam, voornaam, "voetbal");
        this.club = club;
        setOpstelling(opstelling);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("club: " + club + " opstelling: " + opstelling);
    }

    public void setOpstelling(String opstelling) {
        this.opstelling = "onbepaald";
        for (String s : GELDIGE_OPSTELLINGEN) {
            if (s.equals(opstelling)) {
                this.opstelling = opstelling;
            }
        }
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getOpstelling() {
        return opstelling;
    }

    public static String[] getGeldigeOpstellingen() {
        return GELDIGE_OPSTELLINGEN;
    }
}
