package oefeningen.oefening4;

public class InputApp {

    public static void main(String[] args) {
        String naam = Input.readLine("Geef je naam in.");
        int leeftijd = Input.readInt("Geef je leeftijd in.");
        System.out.println(naam);
        System.out.println(leeftijd);
    }


}
