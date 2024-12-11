package extraoefeningen.oefening1;

public class ReisApp {

    public static void main(String[] args) {
        TreinReis reis1 = new TreinReis("Zaventem");
        VliegtuigReis reis2 = new VliegtuigReis("Madrid");
        VliegtuigReis reis3 = new VliegtuigReis("Barcelona", 65, "BX478");
        TreinReis reis4 = new TreinReis("Rosas", 10.75, false, "local train");
        GeboekteReis geboekteReis = new GeboekteReis("Pedro Salopetti", 4);
        geboekteReis.voegReisToe(reis1);
        geboekteReis.voegReisToe(reis2);
        geboekteReis.voegReisToe(reis3);
        geboekteReis.voegReisToe(reis4);

        geboekteReis.print();
    }

}
