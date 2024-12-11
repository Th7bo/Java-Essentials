package extraoefeningen.oefening1;

import extraoefeningen.oefening1.types.Afbeelding;
import extraoefeningen.oefening1.util.ImageReader;
import extraoefeningen.oefening1.util.ImageWriter;

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

        Afbeelding roundBlur = afbeelding.copy();
        roundBlur.roundBlur();
        ImageWriter.writeImage(roundBlur, "test_roundBlur.png");

        Afbeelding randomPath = afbeelding.copy();
        randomPath.randomPath();
        ImageWriter.writeImage(randomPath, "test_randomPath.png");

        Afbeelding inverse = afbeelding.copy();
        inverse.inverse();
        ImageWriter.writeImage(inverse, "test_inverse.png");

        Afbeelding verduister = afbeelding.copy();
        verduister.verduister();
        ImageWriter.writeImage(verduister, "test_verduister.png");
    }

}
