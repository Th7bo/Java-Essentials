package voorbeelden.opdracht10;

public class BankApp {
    public static void main(String[] args) {
        BankAccountNumber bankAccountNumber = new BankAccountNumber();
        bankAccountNumber.setCode("BE");
        bankAccountNumber.setControlDigits(68);
        bankAccountNumber.setNumber(539007547034L);
        System.out.println(bankAccountNumber.getAccount());
        if (bankAccountNumber.isValid()) {
            System.out.println("This bank account number is valid.");
        } else {
            System.out.println("This bank account number is not valid.");
        }
    }
}