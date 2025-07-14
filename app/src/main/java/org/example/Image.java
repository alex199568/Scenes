package org.example;

import java.util.Arrays;
import java.util.Objects;

public class Image {

    public int w;
    public int h;

    private final Color[] pixels;

    public Image(int w, int h) {
        this.w = w;
        this.h = h;
        pixels = new Color[w * h];
        Arrays.fill(pixels, Colors.BLACK);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Image image)) return false;
        return w == image.w && h == image.h && Objects.deepEquals(pixels, image.pixels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(w, h, Arrays.hashCode(pixels));
    }

    public int index(int x, int y) {
        if (x < 0 || x > w) throw new IndexOutOfBoundsException("x=" + x + " is out of bounds for width=" + w);
        if (y < 0 || y > h) throw new IndexOutOfBoundsException("y=" + y + " is out of bounds for height=" + h);
        return y * w + h;
    }

    public Color get(int x, int y) {
        return pixels[index(x, y)];
    }

    public void set(int x, int y, Color color) {
        pixels[index(x, y)] = color;
    }
}
