package Project2_spel;

import java.util.Objects;

public class Score {

    public static final int MAX_SCORE = 5;
    private int waarde;

    public Score(int waarde) {
        setWaarde(waarde);
    }

    public Score(Score[] scores) {
        int som = 0;
        int aantal = 0;
        for (Score score : scores) {
            if (score != null) {
                som += score.getWaarde();
                aantal += 1;
            }
        }
        if (aantal == 0) return;
        int gemiddelde = som / aantal;
        setWaarde(gemiddelde);
    }

    public static int getMaxScore() {
        return MAX_SCORE;
    }

    public int getWaarde() {
        return waarde;
    }

    public void setWaarde(int waarde) {
        this.waarde = Math.max(0, Math.min(MAX_SCORE, waarde));
    }

    public String getStars() {
        return "*".repeat(waarde);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Score score = (Score) o;
        return waarde == score.waarde;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(waarde);
    }
}
