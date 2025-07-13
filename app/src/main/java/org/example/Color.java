package org.example;

import java.util.Objects;

public class Color {

    public double r;
    public double g;
    public double b;

    public Color(double r, double g, double b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Color{" +
                "r=" + r +
                ", g=" + g +
                ", b=" + b +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Color color)) return false;
        return Double.compare(r, color.r) == 0 &&
                Double.compare(g, color.g) == 0 &&
                Double.compare(b, color.b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r, g, b);
    }

    public static final Color WHITE = new Color(1, 1, 1);
    public static final Color GRAY = new Color(0.5, 0.5, 0.5);
    public static final Color BLACK = new Color(0, 0, 0);

    public static final Color RED = new Color(1, 0, 0);
    public static final Color GREEN = new Color(0, 1, 0);
    public static final Color BLUE = new Color(0, 0, 1);
}
