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
        return Numbers.eq(r, color.r) &&
                Numbers.eq(g, color.g) &&
                Numbers.eq(b, color.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(r, g, b);
    }

    public Color add(Color other) {
        return new Color(
                r + other.r,
                g + other.g,
                b + other.b
        );
    }

    public Color sub(Color other) {
        return new Color(
                r - other.r,
                g - other.g,
                b - other.b
        );
    }

    public Color mul(Color other) {
        return new Color(
                r * other.r,
                g * other.g,
                b * other.b
        );
    }

    public Color mul(double d) {
        return new Color(
                r * d,
                g * d,
                b * d
        );
    }

    public Color div(double d) {
        return new Color(
                r / d,
                g / d,
                b / d
        );
    }

    public static final Color WHITE = new Color(1, 1, 1);
    public static final Color GRAY = new Color(0.5, 0.5, 0.5);
    public static final Color BLACK = new Color(0, 0, 0);

    public static final Color RED = new Color(1, 0, 0);
    public static final Color GREEN = new Color(0, 1, 0);
    public static final Color BLUE = new Color(0, 0, 1);
}
