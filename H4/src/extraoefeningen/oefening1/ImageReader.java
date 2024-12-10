package extraoefeningen.oefening1;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ImageReader {

    public static Afbeelding readImage(String name) throws IOException {
        File file = new File("images/input", name);
        if (!file.exists()) throw new FileNotFoundException(name + " not found");
        BufferedImage image = ImageIO.read(file);

        int width = image.getWidth(); // breedte,  x
        int height = image.getHeight(); // hoogte, y
        RGBPixel[][] pixels = new RGBPixel[width][height];

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                // row = y
                // col = x
                int pixel = image.getRGB(col, row);
                Color color = new Color(pixel);
                RGBPixel rgbPixel = new RGBPixel(color.getRed(), color.getGreen(), color.getBlue());
                pixels[col][row] = rgbPixel;
            }
        }

        return new Afbeelding(pixels);
    }
}
