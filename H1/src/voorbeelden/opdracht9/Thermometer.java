package voorbeelden.opdracht9;

public class Thermometer {
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getFahrenheit() {
        return 9.0 / 5 * temperature + 32;
    }
}
