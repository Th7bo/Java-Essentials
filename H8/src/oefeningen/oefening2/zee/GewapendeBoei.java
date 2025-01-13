package oefeningen.oefening2.zee;

public class GewapendeBoei extends ZeeObject {

    private int bereik;
    private int schade;


    public GewapendeBoei(int x, int y, Alliantie alliantie, int levensPunten, int bereik, int schade) {
        super(x, y, alliantie, levensPunten);
        this.bereik = bereik;
        this.schade = schade;
    }

    public void doeSchade(ZeeObject zeeObject) {
        if (getLevensPunten() <= 0) return;
        if (getAlliantie() == zeeObject.getAlliantie()) return;
        if (getLocatie().berekenAfstand(zeeObject.getLocatie()) > bereik) return;
        zeeObject.ontvangSchade(schade);
    }

    @Override
    public String toString() {
        return "Gewapende boei: " + super.toString();
    }
}
