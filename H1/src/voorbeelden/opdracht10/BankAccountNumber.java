package voorbeelden.opdracht10;

public class BankAccountNumber {
    private String name;
    private String code;
    private int controlDigits;
    private long number;

    public String getAccount() {
        return code + controlDigits + number;
    }

    public boolean isValid() {
        long temp = number * 1000000 + 111400;
        long rest = temp % 97;
        return (98 - rest) == controlDigits;
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
