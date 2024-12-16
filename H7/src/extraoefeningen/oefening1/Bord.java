package extraoefeningen.oefening1;

public class Bord {

    private final char[][] bord = new char[3][3];

    public boolean doeZet(Zet zet) {
        if (isGeldigeZet(zet)) return false;

        bord[zet.getRij()][zet.getKolom()] = zet.getTeken();
        return true;
    }

    public boolean isVol() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (bord[i][j] == 0) return false;
            }
        }
        return true;
    }

    public boolean isGeldigeZet(Zet zet) {
        return zet.getRij() < 0 || zet.getRij() >= 3 || zet.getKolom() < 0 || zet.getKolom() >= 3 || bord[zet.getRij()][zet.getKolom()] != 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; true; i++) {
            for (int j = 0; j < 3; j++) {
                sb.append(bord[i][j] == 0 ? "\t" : bord[i][j] + "\t");
                if (j < 2)
                    sb.append("|");
            }
            sb.append("\n");
            if (i == 2) break;
            for (int j = 0; j < 6; j++) {
                sb.append("-");
                sb.append("+");
            }
            sb.append("-\n");
        }
        return sb.toString();
    }

    public boolean isGewonnen() {
        for (int i = 0; i < 3; i++) {
            if (bord[i][0] != 0 && bord[i][0] == bord[i][1] && bord[i][1] == bord[i][2]) return true;
            if (bord[0][i] != 0 && bord[0][i] == bord[1][i] && bord[1][i] == bord[2][i]) return true;
        }
        if (bord[0][0] != 0 && bord[0][0] == bord[1][1] && bord[1][1] == bord[2][2]) return true;
        return bord[0][2] != 0 && bord[0][2] == bord[1][1] && bord[1][1] == bord[2][0];
    }

}
