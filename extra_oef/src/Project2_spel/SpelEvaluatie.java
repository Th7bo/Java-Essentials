package Project2_spel;

public class SpelEvaluatie {

    private Spel spel;
    private Speler speler;
    private Score score;
    private String motivatie;

    public SpelEvaluatie(Spel spel, Speler speler) {
        this.spel = spel;
        this.speler = speler;
    }

    public Spel getSpel() {
        return spel;
    }

    public Speler getSpeler() {
        return speler;
    }

    public Score getScore() {
        return score;
    }

    public String getMotivatie() {
        return motivatie;
    }

    public boolean isGeldig() {
        if (speler == null || spel == null || score == null) return false;
        return speler.getLeeftijd() >= spel.getMinimumLeeftijd();
    }

    public void maakBeoordeling(int score, String motivatie) {
        if (this.motivatie != null) return;
        this.score = new Score(score);
        this.motivatie = motivatie;
    }
}
