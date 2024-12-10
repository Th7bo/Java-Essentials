package voorbeelden.opdracht11;

public class BankAccountNumber {
    private String name;
    private String code;
    private int controlDigits;
    private long number;
    private double bedrag;

    public boolean isValid() {
        long temp = number * 1000000 + 111400;
        long rest = temp % 97;
        return (98 - rest) == controlDigits;
    }

    public void haalAf(double hoeveelheid) {
        if (hoeveelheid > this.bedrag) System.out.println("Niet genoeg geld!");
        else {
            this.bedrag -= hoeveelheid;
        }
    }

    public boolean isLeeg() {
        return this.bedrag == 0;
    }

    public double getBedrag() {
        return bedrag;
    }

    public void setBedrag(double bedrag) {
        this.bedrag = bedrag;
    }

    public String getAccount() {
        return code + controlDigits + number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getControlDigits() {
        return controlDigits;
    }

    public void setControlDigits(int controlDigits) {
        this.controlDigits = controlDigits;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
}
