package oefeningen.oefening2;

public class BankrekeningApp {
    public static void main(String[] args) {
        Bankrekening jef = new Bankrekening("", "Jef Klak", 100.0, 1.2);
        jef.neemOp(50);
        jef.stort(20);
        jef.schrijfRenteBij();


    }
}
