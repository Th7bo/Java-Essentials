package oefeningen.oefening1;

public enum Munt {
    TWEE_HONDERD_CENT(200), HONDERD_CENT(100), VIJFTIG_CENT(50), TWINTIG_CENT(20),
    TIEN_CENT(10), VIJF_CENT(5), TWEE_CENT(2), EEN_CENT(1);
    private int centen;

    private Munt(int centen) {
        this.centen = centen;
    }

    public int getCenten() {
        return this.centen;
    }

    public void setCenten(int centen) {
        this.centen = centen;
    }
}
