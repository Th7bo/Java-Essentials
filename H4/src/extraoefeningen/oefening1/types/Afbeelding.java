package extraoefeningen.oefening1.types;

import java.util.Random;

public class Afbeelding {

    private static final Random rand = new Random();

    private final RGBPixel[][] pixels;

    public Afbeelding(RGBPixel[][] pixels) {
        this.pixels = pixels;
    }

    public RGBPixel[][] getPixels() {
        return pixels;
    }

    public int getHoogte() {
        return pixels[0].length;
    }

    public int getBreedte() {
        return pixels.length;
    }

    public Afbeelding copy() {
        RGBPixel[][] clonedPixels = new RGBPixel[pixels.length][];
        for (int i = 0; i < pixels.length; i++) {
            clonedPixels[i] = new RGBPixel[pixels[i].length];
            for (int j = 0; j < pixels[i].length; j++) {
                if (pixels[i][j] != null) {
                    clonedPixels[i][j] = new RGBPixel(
                            pixels[i][j].getRood(),
                            pixels[i][j].getGroen(),
                            pixels[i][j].getBlauw()
                    );
                }
            }
        }
        return new Afbeelding(clonedPixels);
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

    public void blur() {
        int blockSize = 40;
        int width = getBreedte();
        int height = getHoogte();
        RGBPixel[][] blurredPixels = new RGBPixel[width][height];

        for (int x = 0; x < width; x += blockSize) {
            for (int y = 0; y < height; y += blockSize) {
                mergePixels(blockSize, width, height, blurredPixels, x, y);
            }
        }

        for (int i = 0; i < width; i++) {
            System.arraycopy(blurredPixels[i], 0, pixels[i], 0, height);
        }
    }

    public void dotted() {

        int amount = 20_000 * 5;

        int[] xList = new int[amount];
        int[] yList = new int[amount];
        for (int i = 0; i < amount; i++) {
            xList[i] = rand.nextInt(0, getBreedte() - 1);
            yList[i] = rand.nextInt(0, getHoogte() - 1);
        }


        int width = getBreedte();
        int height = getHoogte();
        RGBPixel[][] dottedPixels = new RGBPixel[width][height];

        for (int idx = 0; idx < amount; idx++) {
            int x = xList[idx];
            int y = yList[idx];
            int blockSize =rand.nextInt(5, 50);
            mergePixels(blockSize, width, height, dottedPixels, x, y);
        }

        movePixels(dottedPixels);
    }

    public void randomPath() {
        int steps = 7;

        int width = getBreedte();
        int height = getHoogte();

        for (int x = 0; x < width; x += 1) {
            for (int y = 0; y < height; y += 1) {
                double doubleX = x;
                double doubleY = y;
                int degrees = rand.nextInt(361);
                RGBPixel dottedPixel = pixels[x][y];

                double radians = Math.toRadians(degrees);

                double deltaX = Math.cos(radians);
                double deltaY = Math.sin(radians);

                for (int step = 0; step < steps; step++) {

                    doubleX += deltaX;
                    doubleY += deltaY;

                    int intX = (int) Math.round(doubleX);
                    int intY = (int) Math.round(doubleY);

                    if (intX < 0 || intX >= width || intY < 0 || intY >= height) {
                        break;
                    }

                    pixels[intX][intY] = dottedPixel;
                }
            }
        }
    }

    public void roundBlur() {
        int rad = 40;
        int width = getBreedte();
        int height = getHoogte();
        RGBPixel[][] blurredPixels = new RGBPixel[width][height];

        for (int x = 0; x < width; x += rad) {
            for (int y = 0; y < height; y += rad) {
                roundMergePixels(width, height, blurredPixels, x, y, rad);
            }
        }

        movePixels(blurredPixels);
    }

    private void mergePixels(int blockSize, int width, int height, RGBPixel[][] blurredPixels, int x, int y) {
        int endX = Math.min(x + blockSize, width);
        int endY = Math.min(y + blockSize, height);

        int red = 0;
        int green = 0;
        int blue = 0;
        int total = 0;

        for (int i = x; i < endX; i++) {
            for (int j = y; j < endY; j++) {
                RGBPixel rgbPixel = pixels[i][j];
                if (rgbPixel != null) {
                    total++;
                    red += rgbPixel.getRood();
                    green += rgbPixel.getGroen();
                    blue += rgbPixel.getBlauw();
                }
            }
        }

        if (total > 0) {
            red /= total;
            green /= total;
            blue /= total;
        }

        for (int i = x; i < endX; i++) {
            for (int j = y; j < endY; j++) {
                blurredPixels[i][j] = new RGBPixel(red, green, blue);
            }
        }
    }

    private void roundMergePixels(int width, int height, RGBPixel[][] blurredPixels, int x, int y, int rad) {
        int endX = Math.min(x + rad, width);
        int endY = Math.min(y + rad, height);

        int red = 0;
        int green = 0;
        int blue = 0;
        int total = 0;

        for (int i = x - rad; i < endX; i++) {
            for (int j = y - rad; j < endY; j++) {
                if (Math.pow(x - i, 2) + Math.pow(y - j, 2) > rad * rad) continue;
                i = Math.max(0, i);
                j = Math.max(0, j);
                RGBPixel rgbPixel = pixels[i][j];
                if (rgbPixel != null) {
                    total++;
                    red += rgbPixel.getRood();
                    green += rgbPixel.getGroen();
                    blue += rgbPixel.getBlauw();
                }
            }
        }

        if (total > 0) {
            red /= total;
            green /= total;
            blue /= total;
        }

        for (int i = x - rad; i < endX; i++) {
            for (int j = y - rad; j < endY; j++) {
                i = Math.max(0, i);
                j = Math.max(0, j);
                if (Math.pow(x - i, 2) + Math.pow(y - j, 2) > rad * rad) continue;
                blurredPixels[i][j] = new RGBPixel(red, green, blue);
            }
        }
    }

    private void movePixels(RGBPixel[][] pixels) {
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                if (pixels[i][j] != null) {
                    this.pixels[i][j] = pixels[i][j];
                }
            }
        }
    }
}
