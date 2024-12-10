package extraoefeningen.oefening1;

import java.io.IOException;
import java.util.Scanner;

public class AfbeeldingApp {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Image name:");
        String imageName = "potter.jpg";// sc.nextLine();
        Afbeelding grijs = ImageReader.readImage(imageName);
        grijs.grijswaarde();
        ImageWriter.writeImage(grijs, "test_grijs.png");

        Afbeelding inverse = ImageReader.readImage(imageName);
        inverse.inverse();
        ImageWriter.writeImage(inverse, "test_inverse.png");

        Afbeelding verduister = ImageReader.readImage(imageName);
        verduister.verduister();
        ImageWriter.writeImage(verduister, "test_verduister.png");
    }

}
