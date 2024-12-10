package extraoefeningen.oefening1;

public class Afbeelding {

    private final RGBPixel[][] pixels;

    public Afbeelding(RGBPixel[][] pixels) {
        this.pixels = pixels;
    }

    public RGBPixel[][] getPixels() {
        return pixels;
    }

    public int getHoogte() {
        return pixels.length;
    }

    public int getBreedte() {
        return pixels[0].length;
    }

    public void grijswaarde() {
        for (RGBPixel[] pixel : pixels) {
            for (RGBPixel rgbPixel : pixel) {
                if (rgbPixel != null) {
                    rgbPixel.naarGrijswaarde();
                }
            }
        }
    }

    public void inverse() {
        for (RGBPixel[] pixel : pixels) {
            for (RGBPixel rgbPixel : pixel) {
                if (rgbPixel != null) {
                    rgbPixel.naarInvert();
                }
            }
        }
    }

    public void verduister() {
        for (RGBPixel[] pixel : pixels) {
            for (RGBPixel rgbPixel : pixel) {
                if (rgbPixel != null) {
                    rgbPixel.verduister(0.1);
                }
            }
        }
    }
}
