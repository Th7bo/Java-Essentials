package oefeningen.oefening1;

public class TorenApp {
    public static void main(String[] args) {
        Toren mijnToren  = new Toren();
        mijnToren.setNaam("Zuidertoren");
        mijnToren.setLocatie("Brussel");
        mijnToren.setVoltooid(1967);
        mijnToren.setHoogteZonderAntenne(150);
        mijnToren.setVerdiepingen(37);

        System.out.printf("De toren %s in %s is voltooid in %d en is %.2fm hoog met %d verdiepingen", mijnToren.getNaam(), mijnToren.getLocatie(), mijnToren.getVoltooid(), mijnToren.getHoogteZonderAntenne(), mijnToren.getVerdiepingen());
    }
}
