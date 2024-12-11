package extraoefeningen.oefening1;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageWriter {

    public static void writeImage(Afbeelding afbeelding, String name) throws IOException {
        File file = new File("images/output", name);

        BufferedImage image = new BufferedImage(afbeelding.getHoogte(), afbeelding.getBreedte(), BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < afbeelding.getHoogte(); i++) {
            for (int j = 0; j < afbeelding.getBreedte(); j++) {
                RGBPixel pixel = afbeelding.getPixels()[i][j];
                image.setRGB(i, j, new Color(pixel.getRood(), pixel.getGroen(), pixel.getBlauw()).getRGB());
            }
        }

        ImageIO.write(image, "png", file);
    }

}
