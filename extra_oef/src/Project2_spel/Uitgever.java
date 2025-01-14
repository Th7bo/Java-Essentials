package Project2_spel;

import java.time.LocalDate;

public class Uitgever {

    private String naam;
    private int jaarOprichting;
    private String hoofdkantoor;
    private String website;

    public Uitgever(String naam, String hoofdkantoor, int jaarOprichting) {
        this.naam = naam;
        setJaarOprichting(jaarOprichting);
        this.hoofdkantoor = hoofdkantoor;
    }

    @Override
    public String toString() {
        String websiteString = (website == null) ? "" : String.format(", website='%s'", website);
        return String.format("Uitgever{naam='%s', jaarOprichting=%d, hoofdkantoor='%s'%s}", naam, jaarOprichting, hoofdkantoor, websiteString);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getJaarOprichting() {
        return jaarOprichting;
    }

    public void setJaarOprichting(int jaarOprichting) {
        if (jaarOprichting > LocalDate.now().getYear()) jaarOprichting = 0;
        this.jaarOprichting = jaarOprichting;
    }

    public String getHoofdkantoor() {
        return hoofdkantoor;
    }

    public void setHoofdkantoor(String hoofdkantoor) {
        this.hoofdkantoor = hoofdkantoor;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
