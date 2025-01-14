package Project2_spel;

public class SpelApp {

    public static void main(String[] args) {
        Uitgever uitgever = new Uitgever("999 games", "Almere", 1990);
        uitgever.setWebsite("www.999games.nl");
        BordSpel spel = new BordSpel("Bonanaza", uitgever);
        spel.setSpeelDuur(45);
        spel.setMinimumLeeftijd(12);
        spel.setAantalSpelers(4);
        System.out.println(spel);

        int aantalSpelers = Input.getInt("Aantal spelers:\n");
        SpelEvaluatie[] evaluaties = new SpelEvaluatie[aantalSpelers];
        for (int i = 0; i < aantalSpelers; i++) {
            String naam = Input.getLine("Geef speler naam:\n");
            int geboorteDatum = Input.getInt("Geboorte datum:\n");
            int scoreAantal = Input.getInt("Score:\n");
            String motivatie = Input.getLine("Motivatie:\n");
            Speler speler = new Speler(naam, geboorteDatum);
            SpelEvaluatie spelEvaluatie = new SpelEvaluatie(spel, speler);
            spelEvaluatie.maakBeoordeling(scoreAantal, motivatie);
            evaluaties[i] = spelEvaluatie;
        }

        System.out.printf("Evaluatie %s %s%n", spel.getNaam(), spel.getUitgever().getNaam());
        int scores = 0;
        for (SpelEvaluatie evaluatie : evaluaties) {
            if (evaluatie != null) {
                System.out.printf("%-10s%7s  %s %s%n", evaluatie.getSpeler().getNaam(), evaluatie.getScore().getStars(), evaluatie.getMotivatie(), (evaluatie.isGeldig()) ? "+" : "-");
                scores += evaluatie.getScore().getWaarde();
            }
        }
        int gemiddelde = scores / aantalSpelers;
        Score gemiddeldeScore = new Score(gemiddelde);
        System.out.printf("Totaalscore: %s%n", gemiddeldeScore.getStars());
    }

}
