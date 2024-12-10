package extraoefeningen.oefening2;

public class Weerstand {

    private char char1;
    private char char2;
    private char char3;

    private char[] weerstanden = {'z', 'b', 'r', 'o', 'g', 'G', 'B', 'V', 'L', 'W'};
    private String[] namen = {"Zwart", "Bruin", "Rood", "Oranje", "Geel", "Groen", "Blauw", "Violet", "Grijs", "Wit"};

    public char getChar1() {
        return char1;
    }

    public void setChar1(char char1) {
        this.char1 = char1;
    }

    public char getChar2() {
        return char2;
    }

    public void setChar2(char char2) {
        this.char2 = char2;
    }

    public char getChar3() {
        return char3;
    }

    public void setChar3(char char3) {
        this.char3 = char3;
    }

    public int getWaarde(char c) {
        for (int i = 0; i < weerstanden.length; i++) {
            if (weerstanden[i] == c) {
                return i;
            }
        }
        return -1;
    }

    public int getWeerstandswaarde() {
        return (10 * getWaarde(char1) + getWaarde(char2)) * (10 ^ getWaarde(char3));
    }

    public String getKleur() {
        return namen[getWaarde(char1)] + " " + namen[getWaarde(char2)] + " " + namen[getWaarde(char3)];
    }

}
