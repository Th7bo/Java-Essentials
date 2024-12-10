package voorbeelden.opdracht12;

public class TempApp {
    public static void main(String[] args) {
        Thermometer thermometer = new Thermometer();

        System.out.printf("|%10s|%10s|%n", "Celsius", "Fahrenheit");
        for (double c = -10; c <= 25; c += 5) {
            thermometer.setTemperature(c);
            System.out.printf("|%10.2f|%10.2f|%n", c, thermometer.getFahrenheit());
        }
        System.out.println();

        for (double c = -10; c <= 10; c += 0.5) {
            thermometer.setTemperature(c);
            System.out.printf("|%-10.2f|%-10.2f|%n", c, thermometer.getFahrenheit());
        }
    }
}
