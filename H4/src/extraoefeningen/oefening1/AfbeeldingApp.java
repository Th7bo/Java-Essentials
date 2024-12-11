package extraoefeningen.oefening1;

import java.io.IOException;
import java.util.Scanner;

public class AfbeeldingApp {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Image name:");
        String imageName = "redpanda.jpg";// sc.nextLine();

        Afbeelding afbeelding = ImageReader.readImage(imageName);

        if (afbeelding == null) System.exit(1);
        Afbeelding grijs = afbeelding.copy();
        grijs.grijswaarde();
        ImageWriter.writeImage(grijs, "test_grijs.png");

        Afbeelding dotted = afbeelding.copy();
        dotted.dotted();
        ImageWriter.writeImage(dotted, "test_dotted.png");

        Afbeelding blur = afbeelding.copy();
        blur.blur();
        ImageWriter.writeImage(blur, "test_blur.png");

        Afbeelding inverse = afbeelding.copy();
        inverse.inverse();
        ImageWriter.writeImage(inverse, "test_inverse.png");

        Afbeelding verduister = afbeelding.copy();
        verduister.verduister();
        ImageWriter.writeImage(verduister, "test_verduister.png");
    }

}
