package oefeningen.oefening4;

import oefeningen.Utils;

public class Gemeente {

    private int postcode;
    private String gemeenteNaam;

    public Gemeente(int postcode, String gemeenteNaam) {
        setPostcode(postcode);
        setGemeenteNaam(gemeenteNaam);
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        if (postcode >= 10_000) postcode = Integer.parseInt((postcode + "").substring(0, 4));
        else if (postcode < 1_000) postcode = postcode * (int) Math.pow(10, (4 - (postcode + "").length()));
        this.postcode = postcode;
    }

    public String toString() {
        return postcode + " " + gemeenteNaam;
    }

    public String getGemeenteNaam() {
        return gemeenteNaam;
    }

    public void setGemeenteNaam(String gemeenteNaam) {
        StringBuilder str = new StringBuilder();
        boolean nextCapital = false;
        for (char c : gemeenteNaam.toCharArray()) {
            if (nextCapital) {
                c = Character.toUpperCase(c);
                nextCapital = false;
            } else {
                c = Character.toLowerCase(c);
            }
            if (c == ' ' || c == '-') nextCapital = true;
            if (Character.isLetter(c) || c == '-' || c == ' ') str.append(c);
        }
        this.gemeenteNaam = Utils.capitalize(str.toString());
    }
}
