package oefeningen.oefening1;

public class WerknemerApp {

    public static void main(String[] args) {
        Werknemer werknemer1 = new Werknemer("Thibo", "Werknemer");
        werknemer1.print();
        Werknemer werknemer2 = new Werknemer("Thibo", "Werknemer2");
        werknemer2.print();
        Manager manager = new Manager("Thibo", "Manager", "Manager", 10000.0);
        manager.print();
        System.out.println(Manager.getProcAandeelManagers());
        System.out.println(manager.getSalaris());
    }

}
