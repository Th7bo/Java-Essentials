package oefeningen.oefening6;

public class Phone {

    private String number;
    private String provider;
    private int numberOfCalls;
    private int numberOfFreeCalls;

    public void call(String number) {
        System.out.printf("Calling %s %n", number);
        if (number.equals("112") || number.equals("102") || number.equals("070245245")) {
            numberOfFreeCalls++;
        }
        numberOfCalls++;
    }

    public double getCost() {
        double price;
        if (provider.equalsIgnoreCase("floximus")) {
            price = 0.25 * (numberOfCalls - numberOfFreeCalls);
            if (numberOfCalls - numberOfFreeCalls > 20) {
                price *= 0.95;
            }
        } else {
            price = 0.21 * (numberOfCalls - numberOfFreeCalls);
        }
        return price;
    }

    public void reset() {
        numberOfFreeCalls = 0;
        numberOfCalls = 0;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public int getNumberOfCalls() {
        return numberOfCalls;
    }

    public void setNumberOfCalls(int numberOfCalls) {
        this.numberOfCalls = numberOfCalls;
    }

    public int getNumberOfFreeCalls() {
        return numberOfFreeCalls;
    }

    public void setNumberOfFreeCalls(int numberOfFreeCalls) {
        this.numberOfFreeCalls = numberOfFreeCalls;
    }
}
