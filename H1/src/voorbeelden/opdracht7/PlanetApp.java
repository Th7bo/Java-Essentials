package voorbeelden.opdracht7;

public class PlanetApp {
    public static void main(String[] args) {
        Planet planet1 = new Planet();
        planet1.setName("Mercury");
        planet1.setDiameter(4879);
        planet1.setDistanceFromSun(57_900_000L);

        Planet planet2 = new Planet();
        planet2.setName("Venus");
        planet2.setDiameter(12104);
        planet2.setDistanceFromSun(108_200_000L);

        if (planet1.getDistanceFromSun() < planet2.getDistanceFromSun()) {
            System.out.println(planet1.getName() + " is closer to the sun.");
        } else {
            System.out.println(planet2.getName() + " is closer to the sun.");
        }

        Planet mars = new Planet();
        mars.setName("Mars");
        mars.setDiameter(6792);
        mars.setDistanceFromSun(227_900_000L);

        Planet earth = new Planet();
        earth.setName("Earth");
        earth.setDiameter(12756);
        earth.setDistanceFromSun(149_600_000L);

        double AE = earth.getDistanceFromSun();
        double marsAE = mars.getDistanceFromSun() / AE;
        System.out.println(mars.getName() + " is " + marsAE + " AE away from the sun.");

        Planet neptune = new Planet();
        neptune.setName("Neptune");
        neptune.setDiameter(49528);
        neptune.setDistanceFromSun(4_495_100_000L);
        double neptuneAE = neptune.getDistanceFromSun() / AE;

        System.out.println(neptune.getName() + " is " + neptuneAE + " AE away from the sun.");
    }
}
