package oefeningen.oefening2;

public class Bankrekening {

    private String rekeningnummer;
    private String eigenaarNaam;
    private double saldo;
    private double rente;

    public Bankrekening(String rekeningnummer, String eigenaarNaam, double saldo, double rente) {
        this.rekeningnummer = rekeningnummer;
        this.eigenaarNaam = eigenaarNaam;
        if (saldo < 0) saldo = 0;
        this.saldo = saldo;
        if (rente < 0) rente = 0;
        this.rente = rente;
        System.out.printf("Bankrekening geopend met saldo %.2f euro%n", saldo);
    }

    public Bankrekening() {
        this("geen", "onbekend", 0, 1.2);
    }

    public void stort(double bedrag) {
        if(!valideerRekening()) return;
        this.saldo += bedrag;
        print();
    }

    public void neemOp(double bedrag) {
        if(!valideerRekening()) return;
        if (saldo == 0.0) System.out.println("U kan geen geld opnemen");
        else if (saldo < bedrag) {
            System.out.printf("U mag enkel %.2f euro opnemen", saldo);
            this.saldo = 0;
        } else this.saldo -= bedrag;
        print();
    }

    public void doeVerrichting(int[] bedragen) {
        if(!valideerRekening()) return;
        for (int getal : bedragen) {
            if (getal < 0) neemOp(getal * -1);
            else if (getal > 0) stort(getal);
        }
    }

    public void schrijfRenteBij() {
        if(!valideerRekening()) return;
        this.saldo += (this.saldo * (this.rente / 100));
        print();
    }

    private boolean valideerRekening() {
        boolean value = eigenaarNaam.equals("onbekend") || rekeningnummer.equals("geen");
        if (value) System.out.println("Deze bankrekening heeft of geen naam of geen eigenaar, actie stopt!");
        return !value;
    }

    public void print() {
        System.out.printf("Saldo op spaarrekening %s op naam van %s bedraagt %.2f%n", rekeningnummer, eigenaarNaam, saldo);
    }

    public void setRekeningnummer(String rekeningnummer) {
        this.rekeningnummer = rekeningnummer;
    }

    public void setEigenaarNaam(String eigenaarNaam) {
        this.eigenaarNaam = eigenaarNaam;
    }

    public double getSaldo() {
        return saldo;
    }
}
