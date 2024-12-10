package voorbeelden.opdracht9;

import java.util.Scanner;

public class TempApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Temperatuur: ");
        double temp = keyboard.nextDouble();
        Thermometer meter = new Thermometer();
        meter.setTemperature(temp);
        System.out.println("Temp fahrenheit: " + meter.getFahrenheit());
        keyboard.close();
    }
}
