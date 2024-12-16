package oefeningen.oefening1;

public class HexConverter {

    public static void main(String[] args) {
        Kleur kleur = new Kleur("awdyagwhd");
        System.out.println(kleur);
        kleur.setHex("#f50324");
        System.out.println(kleur);
        kleur.setRGB(152, 217, 24);
        System.out.println(kleur);

    }

}
